package competition.dao;

import competition.entity.News;

import java.util.List;

public interface NewsDao {
    void addNews(News news);

    List<News> listNews();
}
