package competition.controller;

import competition.entity.Request;
import competition.entity.User;
import competition.service.UserService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@EnableAutoConfiguration
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;


    /**
     * 添加信息
     *
     * @param user
     * @return
     */
    @RequestMapping("/add")
    @ResponseBody
    public Request addUser(User user) {

        return userService.addUser(user);
    }

    /**
     * 用户登陆
     *
     * @param user
     * @return
     */
    @RequestMapping("/login")
    @ResponseBody
    public Request loginUser(User user) {
        return userService.loginUser(user);
    }

    /**
     *根据ID修改信息
     * @param user
     * @return
     */
    @RequestMapping("/update")
    @ResponseBody
    public Request updateUser(User user) {
        return userService.updateUser(user);
    }

    /**
     *根据ID删除信息
     * @param user
     * @return
     */
    @RequestMapping("/del")
    @ResponseBody
    public Request delUser(User user) {
        return userService.delUser(user);
    }

    /**
     *通过学号查看信息
     * @param user
     * @return
     */
    @RequestMapping("/findUserBySchool_num")
    @ResponseBody
    public Request findUserBySchool_num(User user) {
        return userService.findUserBySchool_num(user);
    }
}
