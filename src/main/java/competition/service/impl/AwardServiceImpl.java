package competition.service.impl;

import competition.dao.AwardDao;
import competition.entity.Award;
import competition.entity.Request;
import competition.service.AwardService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service("awardService")
public class AwardServiceImpl implements AwardService {
    @Resource
    private AwardDao awardDao;

    @Override
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

    @Override
    public Request listAwardByCompetition(String message_board) {
        Request request = new Request();
        List list;
        try {
            list = awardDao.listAwardByCompetition(message_board);
            request.setData(list);
            request.setMsg("成功");
        } catch (Exception e) {
            request.setMsg("失败");
        }
        return request;
    }
}
