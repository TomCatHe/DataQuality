package com.dataquality.shanghai.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dataquality.shanghai.entity.PageMenu;
import com.dataquality.shanghai.mapper.PageMenuMapper;
import com.dataquality.shanghai.service.PageMenuService;
import org.springframework.stereotype.Service;

@Service
public class PageMenuServiceImpl extends ServiceImpl<PageMenuMapper, PageMenu> implements PageMenuService {
}
