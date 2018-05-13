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


    @RequestMapping("/add")
    @ResponseBody
    public Request addUser(User user) {

        return userService.addUser(user);
    }

    @RequestMapping("/login")
    @ResponseBody
    public Request loginUser(User user) {
        return userService.loginUser(user);
    }

    @RequestMapping("/update")
    @ResponseBody
    public Request updateUser(User user) {
        return userService.updateUser(user);
    }

    @RequestMapping("/del")
    @ResponseBody
    public Request delUser(User user) {
        return userService.delUser(user);
    }

    @RequestMapping("/findUserBySchool_num")
    @ResponseBody
    public Request findUserBySchool_num(User user) {
        return userService.findUserBySchool_num(user);
    }
}
