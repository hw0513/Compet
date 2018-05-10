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
            award.setPlayer(award.getUserList().get(0));
            awardDao.addAward(award);
            Integer num = awardDao.findPlayernumById(award.getId());
            award.setPlayernum(num);
            for (int i = 1; i < award.getUserList().size(); i++) {
                award.setPlayer(award.getUserList().get(i));
                awardDao.addTeam_member(award);
            }
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
        List list, userList;
        try {
            list = awardDao.listAwardByCompetition(message_board);
            for (int i = 0; i < list.size(); i++) {
                Award award = (Award) list.get(i);
                award.getMessage_board().setId(message_board);
                userList = awardDao.listAwardByMessage_boradAndPlayernum(award);
                ((Award) list.get(i)).setUserList(userList);
            }
            request.setData(list);
            request.setMsg("成功");
        } catch (Exception e) {
            request.setMsg("失败");
        }
        return request;
    }
}
