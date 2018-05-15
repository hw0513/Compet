package competition.service.impl;

import competition.dao.Message_boardDao;
import competition.entity.Message_board;
import competition.entity.Request;
import competition.service.Message_boardService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("message_boardService")
public class Message_boardServiceImpl implements Message_boardService {
    @Resource
    private Message_boardDao message_boardDao;

    @Override
    public Request addMessage_board(Message_board message_board) {
        Request request = new Request();
        try {
            message_boardDao.addMessage_board(message_board);
            request.setMsg("成功");
        } catch (Exception e) {
            request.setMsg("失败");
        }
        return request;
    }

    @Override
    public Request updateMessage_board(Message_board message_board) {
        Request request = new Request();
        try {
            message_boardDao.updateMessage_board(message_board);
            request.setMsg("成功");
        } catch (Exception e) {
            request.setMsg("失败");
        }
        return request;
    }

    @Override
    public Request listMessage_board() {
        Request request = new Request();
        try {
            List list = message_boardDao.listMessage_board();
            request.setData(list);
            request.setMsg("成功");
        } catch (Exception e) {
            request.setMsg("失败");
        }
        return request;
    }

    @Override
    public Request delMessage_board(Message_board message_board) {
        return null;
    }

    @Override
    public Request endRegistrationMessage_board() {
        Request request = new Request();
        try {
            List list = message_boardDao.endRegistrationMessage_board();
            request.setData(list);
            request.setMsg("成功");
        } catch (Exception e) {
            request.setMsg("失败");
        }

        return request;
    }

    @Override
    public Request endCompetitionMessage_board() {
        Request request = new Request();
        try {
            List list = message_boardDao.endCompetitionMessage_board();
            request.setData(list);
            request.setMsg("成功");
        } catch (Exception e) {
            request.setMsg("失败");
        }

        return request;
    }

    @Override
    public Request findMessage_boardById(Message_board message_board) {
        Request request = new Request();
        try {
            message_board = message_boardDao.findMessage_boardById(message_board);
            request.setData(message_board);
            request.setMsg("成功");
        } catch (Exception e) {
            request.setMsg("失败");
        }
        return request;
    }
}
