package competition.dao;

import competition.entity.Competition;
import competition.entity.Page;

import java.util.List;

public interface CompetitionDao {
    void addCompetition(Competition competition);

    void updateCompetition(Competition competition);

    void delCompetition(Competition competition);

    List<Competition> findAllCompetition();

    Integer getCompetition_way(String competition);

    List<Competition> findCompetitionByPage(Page page);

    Integer findCountCompetition();
}
