package competition.controller;

import competition.entity.Message_board;
import competition.entity.Request;
import competition.service.Message_boardService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/message_board")
public class Message_boardController {
    @Resource
    private Message_boardService message_boardService;

    /**
     * 添加比赛信息
     *
     * @param message_board  比赛信息
     * @return
     */
    @RequestMapping(value = "/add")
    public Request addMessage_board(@RequestBody Message_board message_board) {
        return message_boardService.addMessage_board(message_board);
    }

    @RequestMapping("/update")
    public Request updateMessage_board(Message_board message_board) {
        return message_boardService.updateMessage_board(message_board);
    }

    @RequestMapping("/del")
    public Request delMessage_board(Message_board message_board) {
        return message_boardService.delMessage_board(message_board);
    }

    @RequestMapping("/list")
    public Request listMessage_board() {
        return message_boardService.listMessage_board();
    }

    @RequestMapping("/endRegistration")
    public Request endRegistrationMessage_board() {
        return message_boardService.endRegistrationMessage_board();
    }
}
