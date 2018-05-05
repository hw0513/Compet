package competition.dao;

import competition.entity.Competition;

import java.util.List;

public interface CompetitionDao {
    void addCompetition(Competition competition);

    void updateCompetition(Competition competition);

    void delCompetition(Competition competition);

    List<Competition> findAllCompetition();
}
