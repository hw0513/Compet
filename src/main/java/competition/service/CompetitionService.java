package competition.service;

import competition.entity.Competition;
import competition.entity.Page;
import competition.entity.Request;

public interface CompetitionService {

    Request addCompetition(Competition competition);

    Request updateCompetition(Competition competition);

    Request delCompetition(Competition competition);

    Request findAllCompetition();

    Request getCompetition_way(String competition);

    Request findCompetitionByPage(Page page);

    Request findCountCompetition();
}
