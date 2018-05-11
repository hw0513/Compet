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

    /**
     * 添加信息
     *
     * @param competition
     * @return 是否添加成功
     */
    @RequestMapping("/add")
    @ResponseBody
    public Request addCompetition(Competition competition) {
        return competitionService.addCompetition(competition);
    }

    /**
     * 按id修改
     * @param competition
     * @return 是否修改成功
     */

    @RequestMapping("/update")
    @ResponseBody
    public Request updateCompetition(Competition competition) {
        return competitionService.updateCompetition(competition);
    }

    /**
     * 按ID删除记录
     * @param competition 只需传id
     * @return 是否删除成功
     */
    @RequestMapping("/del")
    @ResponseBody
    public Request delCompetition(Competition competition) {
        return competitionService.delCompetition(competition);
    }

    /**
     *
     * 查询所有的记录
     * @return 所有记录
     */
    @RequestMapping("/list")
    public Request findAllCompetition() {
        return competitionService.findAllCompetition();
    }

    /**
     * 查找所有的记录的数量
     *
     * @return 总的条目
     */
    @RequestMapping("/findCount")
    public Request findCountCompetition() {
        return competitionService.findCountCompetition();
    }

    /**
     * 按页码查询
     * @param page
     * @return
     */
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
     * @return 参赛的人数
     */
    @RequestMapping("/competition_way")
    public Request getCompetition_way(String competition) {
        return competitionService.getCompetition_way(competition);
    }
}
