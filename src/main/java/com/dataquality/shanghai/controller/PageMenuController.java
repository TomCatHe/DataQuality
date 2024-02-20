package com.dataquality.shanghai.controller;

import com.dataquality.shanghai.entity.PageMenu;
import com.dataquality.shanghai.service.PageMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class PageMenuController {

    @Autowired
    PageMenuService pageMenuService;

    @RequestMapping("/menu")
    public List<PageMenu> selectAll() {
        return pageMenuService.list();
    }
}
