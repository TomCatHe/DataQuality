package com.dataquality.shanghai.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("id_card_type")
// 身份证件类别代码表
public class IdCardType {

    private String id;
    private String name;
    private String memo;
}
