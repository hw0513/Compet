package competition.service.impl;

import competition.dao.NewsDao;
import competition.entity.News;
import competition.entity.Request;
import competition.service.NewsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service("newsService")
@Transactional
public class NewsServiceImpl implements NewsService {
    @Resource
    private NewsDao newsDao;

    @Override
    public Request addNews(News news) {
        newsDao.addNews(news);
        return null;
    }

    @Override
    public Request listNews() {
        Request request = new Request();
        try {
            List list = newsDao.listNews();
            request.setData(list);
            request.setMsg("成功");
        } catch (Exception e) {
            request.setMsg("失败");
        }
        return request;
    }
}
