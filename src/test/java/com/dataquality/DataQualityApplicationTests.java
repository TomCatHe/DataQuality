package com.dataquality;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import org.apache.ibatis.annotations.Mapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

@SpringBootTest
class DataQualityApplicationTests {

    @Autowired
    DataSource dataSource;

    @Test
    void contextLoads() {
    }

//    @Test
//    void TestAuto() {
//            FastAutoGenerator
//                    .create(new DataSourceConfig.Builder(dataSource))
//                    .globalConfig(builder -> {
//                        builder.author("TomCatHe");              //作者信息，一会会变成注释
//                        builder.commentDate("2024-01-18");  //日期信息，一会会变成注释
//                        builder.outputDir("src/main/java"); //输出目录设置为当前项目的目录
//                    })
//                    .packageConfig(builder -> builder.parent("com.dataquality.shanghai"))
//                    .strategyConfig(builder -> {
//                        //设置为所有Mapper添加@Mapper注解
//                        builder
//                                .mapperBuilder()
//                                .mapperAnnotation(Mapper.class)
//                                .build();
//                    })
//                    .execute();
//    }

}
