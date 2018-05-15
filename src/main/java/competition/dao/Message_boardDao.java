package competition.dao;

import competition.entity.Message_board;

import java.util.List;

public interface Message_boardDao {
    void addMessage_board(Message_board message_board);

    void updateMessage_board(Message_board message_board);

    List<Message_board> listMessage_board();

    List<Message_board> endRegistrationMessage_board();

    List<Message_board> endCompetitionMessage_board();

    Message_board findMessage_boardById(Message_board message_board);
}
