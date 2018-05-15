package competition.service;

import competition.entity.Message_board;
import competition.entity.Request;

public interface Message_boardService {
    Request addMessage_board(Message_board message_board);

    Request updateMessage_board(Message_board message_board);

    Request listMessage_board();

    Request delMessage_board(Message_board message_board);

    Request endRegistrationMessage_board();

    Request endCompetitionMessage_board();

    Request findMessage_boardById(Message_board message_board);
}
