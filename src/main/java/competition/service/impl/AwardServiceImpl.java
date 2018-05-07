package competition.service.impl;

import competition.dao.AwardDao;
import competition.entity.Award;
import competition.entity.Request;
import competition.service.AwardService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


@Service("awardService")
public class AwardServiceImpl implements AwardService {
    @Resource
    private AwardDao awardDao;

    @Override
    @Transactional
    public Request addAward(Award award) {
        Request request = new Request();
        try {

            awardDao.addAward(award);
            awardDao.addTotal(award.getMessage_board());
            request.setData(award);
            request.setMsg("成功");
        } catch (Exception e) {
            request.setData(award);
            request.setMsg("失败");
        }
        return request;
    }
}
