package competition.service.impl;

import competition.dao.NewsDao;
import competition.entity.News;
import competition.entity.Request;
import competition.service.NewsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service("newsService")
@Transactional
public class NewsServiceImpl implements NewsService{
    @Resource
    private NewsDao newsDao;

    @Override
    public Request addNews(News news) {
        newsDao.addNews(news);
        return null;
    }
}
