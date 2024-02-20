package com.dataquality.shanghai.controller;

import com.dataquality.shanghai.entity.DataDictDesc;
import com.dataquality.shanghai.service.IDataDictDescService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author TomCatHe
 * @since 2024-01-18
 */
@RestController
@CrossOrigin
public class DataDictDescController {

    @Autowired
    IDataDictDescService dataDictDescService;

    @RequestMapping("/dataDictDesc")
    public List<DataDictDesc> selectAll() {
        return dataDictDescService.list();
    }

}
