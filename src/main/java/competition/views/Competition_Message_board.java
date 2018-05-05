package competition.views;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Competition_Message_board {
    private String id;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date start_enter;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date end_enter;
    private String place;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date begin_competition;
    private Integer total;
    private String isdel;

    private String competition_id;
    private String competition_name;
    private String competition_host_unit;
    private String competition_lev;
    private String competition_competition_describe;
    private Integer competition_competition_way;
    private String competition_type;
    private String competition_isdel;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getStart_enter() {
        return start_enter;
    }

    public void setStart_enter(Date start_enter) {
        this.start_enter = start_enter;
    }

    public Date getEnd_enter() {
        return end_enter;
    }

    public void setEnd_enter(Date end_enter) {
        this.end_enter = end_enter;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Date getBegin_competition() {
        return begin_competition;
    }

    public void setBegin_competition(Date begin_competition) {
        this.begin_competition = begin_competition;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String getIsdel() {
        return isdel;
    }

    public void setIsdel(String isdel) {
        this.isdel = isdel;
    }

    public String getCompetition_id() {
        return competition_id;
    }

    public void setCompetition_id(String competition_id) {
        this.competition_id = competition_id;
    }

    public String getCompetition_name() {
        return competition_name;
    }

    public void setCompetition_name(String competition_name) {
        this.competition_name = competition_name;
    }

    public String getCompetition_host_unit() {
        return competition_host_unit;
    }

    public void setCompetition_host_unit(String competition_host_unit) {
        this.competition_host_unit = competition_host_unit;
    }

    public String getCompetition_lev() {
        return competition_lev;
    }

    public void setCompetition_lev(String competition_lev) {
        this.competition_lev = competition_lev;
    }

    public String getCompetition_competition_describe() {
        return competition_competition_describe;
    }

    public void setCompetition_competition_describe(String competition_competition_describe) {
        this.competition_competition_describe = competition_competition_describe;
    }

    public Integer getCompetition_competition_way() {
        return competition_competition_way;
    }

    public void setCompetition_competition_way(Integer competition_competition_way) {
        this.competition_competition_way = competition_competition_way;
    }

    public String getCompetition_type() {
        return competition_type;
    }

    public void setCompetition_type(String competition_type) {
        this.competition_type = competition_type;
    }

    public String getCompetition_isdel() {
        return competition_isdel;
    }

    public void setCompetition_isdel(String competition_isdel) {
        this.competition_isdel = competition_isdel;
    }
}
