package com.dataquality.shanghai.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dataquality.shanghai.entity.DataDict;
import com.dataquality.shanghai.service.IDataDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
public class DataDictController {

    @Autowired
    private IDataDictService dataDictService;

    @GetMapping("/dataDict/{type}")
    public List<DataDict> list(@PathVariable Integer type) {
        QueryWrapper<DataDict> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("type",type);
        return dataDictService.list(queryWrapper);
    }

}
