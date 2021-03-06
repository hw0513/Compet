package competition.service.impl;

import competition.Utils.MD5Util;
import competition.dao.UserDao;
import competition.entity.Request;
import competition.entity.User;
import competition.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public Request addUser(User user) {
        user.setPassword(MD5Util.getMd5(user.getPassword()));
        Request request = new Request();
        try {
            userDao.addUser(user);
            request.setMsg("成功");
        } catch (Exception e) {
            request.setMsg("失败");
        }
        return request;
    }

    @Override
    public Request loginUser(User user) {
        user.setPassword(MD5Util.getMd5(user.getPassword()));
        Request request = new Request();
        if (userDao.loginUser(user).size() > 0) {
            request.setMsg("成功");
        } else {
            request.setMsg("失败");
        }
        return request;
    }

    @Override
    public Request updateUser(User user) {
        Request request = new Request();
        try {
            userDao.updateUser(user);
            request.setMsg("成功");
        } catch (Exception e) {
            request.setMsg("失败");
        }
        return request;
    }

    @Override
    public Request delUser(User user) {
        Request request = new Request();
        try {
            userDao.delUser(user);
            request.setMsg("成功");
        } catch (Exception e) {
            request.setMsg("失败");
        }
        return request;
    }

    @Override
    public Request findUserBySchool_num(User user) {
        Request request = new Request();
        try {
            user = userDao.findUserBySchool_num(user);
            request.setMsg("成功");
            request.setData(user);
        } catch (Exception e) {
            request.setMsg("失败");
        }
        return request;
    }

    @Override
    public Request updatePasswordBySchool_num(User user) {
        user.setPassword(MD5Util.getMd5(user.getPassword()));
        Request request = new Request();
        try {
            userDao.updatePasswordBySchool_num(user);
            request.setMsg("成功");
        } catch (Exception e) {
            request.setMsg("失败");
        }
        return request;
    }
}
