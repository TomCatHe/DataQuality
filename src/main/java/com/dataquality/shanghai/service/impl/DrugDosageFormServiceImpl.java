package com.dataquality.shanghai.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dataquality.shanghai.entity.DrugDosageForm;
import com.dataquality.shanghai.mapper.DrugDosageFormMapper;
import com.dataquality.shanghai.service.DrugDosageFormService;
import org.springframework.stereotype.Service;

@Service
public class DrugDosageFormServiceImpl extends ServiceImpl<DrugDosageFormMapper, DrugDosageForm> implements DrugDosageFormService {
}
