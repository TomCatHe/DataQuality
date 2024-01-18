package com.dataquality.shanghai.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("drug_dosage_form")
public class DrugDosageForm {

    private String id;
    private String name;
    private String memo;
}
