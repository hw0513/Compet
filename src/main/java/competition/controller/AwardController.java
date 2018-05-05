package competition.controller;

import competition.entity.Award;
import competition.entity.Request;
import competition.service.AwardService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@EnableAutoConfiguration
@RequestMapping("/award")
public class AwardController {
    @Resource
    private AwardService awardService;
    @RequestMapping("/add")
    @ResponseBody
    private Request addAward(Award award){
        return awardService.addAward(award);
    }
}
