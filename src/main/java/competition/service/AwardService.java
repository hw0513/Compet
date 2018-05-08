package competition.service;

import competition.entity.Award;
import competition.entity.Request;
import org.springframework.transaction.annotation.Transactional;

public interface AwardService {
    @Transactional
    Request addAward(Award award);

    Request listAwardByCompetition(String message_board);
}
