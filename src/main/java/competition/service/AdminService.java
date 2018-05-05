package competition.service;

import competition.entity.Admin;
import competition.entity.Request;

public interface AdminService {


    public Request loginAdmin(Admin admin);

    public Request addAdmin(Admin admin);

    public Request updateAdmin(Admin admin);
}

