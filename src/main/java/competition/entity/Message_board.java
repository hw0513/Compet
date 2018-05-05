package competition.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 比赛信息类
 */

public class Message_board{
    private String id;
    private Competition competition;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date start_enter;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date end_enter;
    private String place;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date begin_competition;
    private Integer total;
    private String isdel;

    public String getIsdel() {
        return isdel;
    }

    public void setIsdel(String isdel) {
        this.isdel = isdel;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Competition getCompetition() {
        return competition;
    }

    public void setCompetition(Competition competition) {
        this.competition = competition;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
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

    @Override
    public String toString() {
        return "Message_board{" +
                "id='" + id + '\'' +
                ", competition=" + competition +
                ", start_enter=" + start_enter +
                ", end_enter=" + end_enter +
                ", place='" + place + '\'' +
                ", begin_competition=" + begin_competition +
                ", total=" + total +
                ", isdel='" + isdel + '\'' +
                '}';
    }
}
