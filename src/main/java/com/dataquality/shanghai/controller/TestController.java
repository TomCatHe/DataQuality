package com.dataquality.shanghai.controller;

import com.dataquality.shanghai.entity.IdCardType;
import com.dataquality.shanghai.service.IdCardTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TestController {

    @Autowired
    IdCardTypeService idCardTypeService;

    @GetMapping("/test")
    @ResponseBody
    public List<IdCardType> test() {
        List<IdCardType> list = idCardTypeService.list();
        list.forEach(System.out::println);
        return list;
    }
}
