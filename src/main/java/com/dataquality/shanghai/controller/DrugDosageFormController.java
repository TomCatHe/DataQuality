package com.dataquality.shanghai.controller;

import com.dataquality.shanghai.entity.DrugDosageForm;
import com.dataquality.shanghai.service.DrugDosageFormService;
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
@RequestMapping("/drugDosageForm")
public class DrugDosageFormController {

    @Autowired
    DrugDosageFormService drugDosageFormService;

    @RequestMapping(value = "/all")
    public List<DrugDosageForm> selectAll() {
        return drugDosageFormService.list();
    }

}
