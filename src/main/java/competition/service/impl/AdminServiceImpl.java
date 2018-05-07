package competition.service.impl;

import competition.dao.AdminDao;
import competition.entity.Admin;
import competition.entity.Request;
import competition.service.AdminService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service("adminService")
@Transactional
public class AdminServiceImpl implements AdminService {

    @Resource
    private AdminDao adminDao;

    @Override
    public Request loginAdmin(Admin admin) {
        Request request = new Request();
        request.setData(admin);
        if (adminDao.loginAdmin(admin).size() > 0) {
            request.setMsg("成功");
        } else {
            request.setMsg("失败");
        }
        return request;
    }

    @Override
    public Request addAdmin(Admin admin) {
        Request request = new Request();
        request.setData(admin);
        try {
            adminDao.addAdmin(admin);
            request.setMsg("成功");
        } catch (Exception e) {
            request.setMsg("失败");
        }
        return request;
    }

    @Override
    public Request updateAdmin(Admin admin) {
        Request request = new Request();
        request.setData(admin);
        try {
            adminDao.updateAdmin(admin);
            request.setMsg("成功");
        } catch (Exception e) {
            request.setMsg("失败");
        }
        return request;
    }


}
