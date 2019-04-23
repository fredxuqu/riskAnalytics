package com.himalaya.app.user.service.impl;

import org.springframework.stereotype.Service;

import com.himalaya.app.common.service.AbstractBaseService;
import com.himalaya.app.user.domain.NewsDO;
import com.himalaya.app.user.mapper.NewsMapper;
import com.himalaya.app.user.service.NewsService;

@Service
public class NewsServiceImpl extends AbstractBaseService<NewsMapper, NewsDO, Long> implements NewsService{

}
