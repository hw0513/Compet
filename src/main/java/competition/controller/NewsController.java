package competition.controller;

import competition.entity.News;
import competition.entity.Request;
import competition.service.NewsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/news")
public class NewsController {

    @Resource
    private NewsService newsService;


    /**
     * 添加新闻
     *
     * @param news 新闻信息
     * @return Request是否成功
     */
    @RequestMapping("/add")
    @ResponseBody
    public Request addNews(News news) {
        return newsService.addNews(news);
    }

    /**
     * 查询所有新闻
     *
     * @return Request是否成功
     */
    @RequestMapping("/list")
    @ResponseBody
    public Request listNews() {
        return newsService.listNews();
    }
}
