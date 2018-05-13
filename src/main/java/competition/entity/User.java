package competition.entity;

public class User {

    private String id;
    private Integer school_num;
    private String password;
    private String name;
    private Integer phone;
    private String user_class;
    private String isdel;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSchool_num() {
        return school_num;
    }

    public void setSchool_num(Integer school_num) {
        this.school_num = school_num;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getUser_class() {
        return user_class;
    }

    public void setUser_class(String user_class) {
        this.user_class = user_class;
    }

    public String getIsdel() {
        return isdel;
    }

    public void setIsdel(String isdel) {
        this.isdel = isdel;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", school_num=" + school_num +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                ", user_class='" + user_class + '\'' +
                ", isdel='" + isdel + '\'' +
                '}';
    }
}
