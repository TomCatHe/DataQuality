package com.dataquality.shanghai.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dataquality.shanghai.entity.IdCardType;
import com.dataquality.shanghai.mapper.IdCardTypeMapper;
import com.dataquality.shanghai.service.IdCardTypeService;
import org.springframework.stereotype.Service;

@Service
public class IdCardTypeServiceImpl extends ServiceImpl<IdCardTypeMapper, IdCardType> implements IdCardTypeService {

}
