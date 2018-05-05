package competition.service;

import competition.entity.Request;
import competition.entity.User ;

public interface UserService {
    Request addUser(User user);

    Request loginUser(User user);

    Request updateUser(User user);

    Request delUser(User user);
}
