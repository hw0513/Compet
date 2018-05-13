package competition.dao;


import competition.entity.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);

    List<User> loginUser(User user);

    void updateUser(User user);

    void delUser(User user);

    User findUserBySchool_num(User user);
}
