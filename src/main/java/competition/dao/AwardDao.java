package competition.dao;

import competition.entity.Award;
import competition.entity.Message_board;

import java.util.List;

public interface AwardDao {
    void addAward(Award award);

    void addTotal(Message_board message_board);

    List<Award> listAwardByCompetition(String message_board);
}
