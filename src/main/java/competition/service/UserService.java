package competition.service;

import competition.entity.Request;
import competition.entity.User;

public interface UserService {
    Request addUser(User user);

    Request loginUser(User user);

    Request updateUser(User user);

    Request delUser(User user);

    Request findUserBySchool_num(User user);

    Request updatePasswordBySchool_num(User user);
}
