package com.dataquality.shanghai.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("menu")
public class PageMenu {

    private String menuId;
    private String parentMenuId;
    private String title;
    private String url;
    private Integer sort;
}
