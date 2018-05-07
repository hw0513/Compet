package competition.controller;

import competition.entity.News;
import competition.entity.Request;
import competition.service.NewsService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@EnableAutoConfiguration
@RequestMapping("/news")
public class NewsController {

    @Resource
    private NewsService newsService;


    @RequestMapping("/add")
    @ResponseBody
    public Request addAdmin(News news) {
        return newsService.addNews(news);
    }
}
