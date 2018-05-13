package competition.controller;

import competition.entity.Admin;
import competition.entity.Request;
import competition.service.AdminService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@EnableAutoConfiguration
@RequestMapping("/admin")
public class AdminController {

    @Resource
    private AdminService adminService;


    /**
     * 管理员注册
     *
     * @param admin
     * @return Request 成功或者失败
     */
    @RequestMapping("/add")
    @ResponseBody
    public Request addAdmin(Admin admin) {

        return adminService.addAdmin(admin);
    }

    /**
     * 管理员登陆
     *
     * @param admin
     * @return Request 成功或者失败
     */
    @RequestMapping("/login")
    @ResponseBody
    public Request loginAdmin(Admin admin) {
        return adminService.loginAdmin(admin);
    }

    /**
     * 修改管理员信息
     * @param admin
     * @return
     */
    @RequestMapping("/update")
    @ResponseBody
    public Request updateAdmin(Admin admin) {
        return adminService.updateAdmin(admin);
    }
}
