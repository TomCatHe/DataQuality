package com.dataquality.shanghai.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("dictionary_mapping")
public class DictionaryMapping {

    private Integer id;
    private String platformCode;
    private String localCode;
    private String type;
}
