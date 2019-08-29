package com.yang.service.simple;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.yang.model.simple.News;


public interface NewsService {

    public boolean addNews(News news);

    public boolean editNews(News news);

    public News findNewsById(String newsId);

    public List<News> findNewsByKeywords(String keywords);

    public PageInfo<News> findNewsByPage(Integer pageNum, String keywords);

    public PageInfo<News> findNewsByPage1(Integer pageNum, String keywords);

    public PageInfo<News> findNewsByPage2(Integer pageNum, String keywords);

}