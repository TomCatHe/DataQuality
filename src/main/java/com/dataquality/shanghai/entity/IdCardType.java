package com.dataquality.shanghai.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("id_card_type")
public class IdCardType {

    private String id;
    private String name;
    private String memo;
}
