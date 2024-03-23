package com.dataquality.shanghai.controller;

import com.dataquality.shanghai.entity.DictionaryMapping;
import com.dataquality.shanghai.service.DictionaryMappingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class DictionaryMappingController {

    @Autowired
    private DictionaryMappingService dictionaryMappingService;

    @RequestMapping("/dictionaryMapping")
    public List<DictionaryMapping> selectAll() {
        return dictionaryMappingService.list();
    }

}
