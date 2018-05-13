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
     * @param message_board  比赛信息
     * @return Request
     */
    @RequestMapping(value = "/add")
    public Request addMessage_board(@RequestBody Message_board message_board) {
        return message_boardService.addMessage_board(message_board);
    }

    /**
     * 修改比赛信息
     * @param message_board message_board的ID
     * @return 是否修改成功
     */
    @RequestMapping("/update")
    public Request updateMessage_board(@RequestBody Message_board message_board) {
        return message_boardService.updateMessage_board(message_board);
    }

    /**
     * 删除比赛信息
     *
     * @param message_board message_board的ID
     * @return Request 是否成功
     */
    @RequestMapping("/del")
    public Request delMessage_board(Message_board message_board) {
        return message_boardService.delMessage_board(message_board);
    }

    /**
     *查看所有比赛信息
     * @return
     */
    @RequestMapping("/list")
    public Request listMessage_board() {
        return message_boardService.listMessage_board();
    }

    /**
     *查看正在报名的比赛信息
     * @return Request 所有报名的比赛信息
     */
    @RequestMapping("/endRegistration")
    public Request endRegistrationMessage_board() {
        return message_boardService.endRegistrationMessage_board();
    }

    /**
     * 查看成功举办的比赛信息
     *
     * @return
     */
    @RequestMapping("/endCompetition")
    public Request endCompetitionMessage_board() {
        return message_boardService.endCompetitionMessage_board();
    }
}
