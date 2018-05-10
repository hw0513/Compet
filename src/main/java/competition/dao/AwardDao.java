package competition.dao;

import competition.entity.Award;
import competition.entity.Message_board;
import competition.entity.User;

import java.util.List;

public interface AwardDao {
    void addAward(Award award);

    void addTotal(Message_board message_board);

    List<Award> listAwardByCompetition(String message_board);

    void addTeam_member(Award award);

    Integer findPlayernumById(String Id);

    List<User> listAwardByMessage_boradAndPlayernum(Award award);

}
