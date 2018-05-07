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


    @RequestMapping("/add")
    @ResponseBody
    public Request addAdmin(Admin admin) {

        return adminService.addAdmin(admin);
    }

    @RequestMapping("/login")
    @ResponseBody
    public Request loginAdmin(Admin admin) {
        return adminService.loginAdmin(admin);
    }

    @RequestMapping("/update")
    @ResponseBody
    public Request updateAdmin(Admin admin) {
        return adminService.updateAdmin(admin);
    }
}
