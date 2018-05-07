package competition.dao;

import competition.entity.Award;
import competition.entity.Message_board;

public interface AwardDao {
    void addAward(Award award);

    void addTotal(Message_board message_board);
}
