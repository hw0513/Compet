package competition.controller;

import competition.entity.Competition;
import competition.entity.Page;
import competition.entity.Request;
import competition.service.CompetitionService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
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
    public Request addCompetition(Competition competition) {
        return competitionService.addCompetition(competition);
    }


    @RequestMapping("/update")
    @ResponseBody
    public Request updateCompetition(Competition competition) {
        return competitionService.updateCompetition(competition);
    }

    @RequestMapping("/del")
    @ResponseBody
    public Request delCompetition(Competition competition) {
        return competitionService.delCompetition(competition);
    }

    @RequestMapping("/list")
    public Request findAllCompetition() {
        return competitionService.findAllCompetition();
    }


    @RequestMapping("/listByPage")
    @ResponseBody
    public Request findCompetitionByPage(@RequestBody Page page) {
        page.setStart_items((page.getPageCode() - 1) * page.getLimit());
        return competitionService.findCompetitionByPage(page);
    }

    /**
     * 获取参赛人数
     *
     * @param competition
     * @return
     */
    @RequestMapping("/competition_way")
    public Request getCompetition_way(String competition) {
        return competitionService.getCompetition_way(competition);
    }
}
