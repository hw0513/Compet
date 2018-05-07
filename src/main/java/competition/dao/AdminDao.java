package competition.dao;


import competition.entity.Admin;

import java.util.List;

public interface AdminDao {


    List<Admin> loginAdmin(Admin admin);

    void addAdmin(Admin admin);

    void updateAdmin(Admin admin);
}
