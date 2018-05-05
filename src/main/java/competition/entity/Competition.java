package competition.entity;


public class Competition {

    private String id;
    private String name;
    private String host_unit;
    private String lev;
    private String competition_describe;
    private Integer competition_way;
    private String type;
    private String isdel;

    public String getIsdel() {
        return isdel;
    }

    public void setIsdel(String isdel) {
        this.isdel = isdel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHost_unit() {
        return host_unit;
    }

    public void setHost_unit(String host_unit) {
        this.host_unit = host_unit;
    }

    public String getLev() {
        return lev;
    }

    public void setLev(String lev) {
        this.lev = lev;
    }

    public String getCompetition_describe() {
        return competition_describe;
    }

    public void setCompetition_describe(String competition_describe) {
        this.competition_describe = competition_describe;
    }

    public Integer getCompetition_way() {
        return competition_way;
    }

    public void setCompetition_way(Integer competition_way) {
        this.competition_way = competition_way;
    }

    @Override
    public String toString() {
        return "Competition{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", host_unit='" + host_unit + '\'' +
                ", lev='" + lev + '\'' +
                ", competition_describe='" + competition_describe + '\'' +
                ", competition_way=" + competition_way +
                ", type='" + type + '\'' +
                ", isdel='" + isdel + '\'' +
                '}';
    }
}
