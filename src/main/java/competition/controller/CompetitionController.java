package competition.controller;

import competition.entity.Competition;
import competition.entity.Request;
import competition.service.CompetitionService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@EnableAutoConfiguration

@RequestMapping("/competition")
public class CompetitionController {
    @Resource
    private CompetitionService competitionService;

    @RequestMapping("/add")
    @ResponseBody
    private Request addCompetition(Competition competition) {
        return competitionService.addCompetition(competition);
    }


    @RequestMapping("/update")
    @ResponseBody
    private Request updateCompetition(Competition competition) {
        return competitionService.updateCompetition(competition);
    }

    @RequestMapping("/del")
    @ResponseBody
    private Request delCompetition(Competition competition) {
        return competitionService.delCompetition(competition);
    }

    @RequestMapping("/list")
    private Request findAllCompetition() {
        return competitionService.findAllCompetition();
    }
}
