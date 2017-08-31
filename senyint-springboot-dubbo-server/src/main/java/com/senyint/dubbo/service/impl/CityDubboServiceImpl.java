package com.senyint.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.senyint.dubbo.entity.City;
import com.senyint.dubbo.service.CityDubboService;

// 注册为 Dubbo 服务
@Service(version = "1.0.0")
public class CityDubboServiceImpl implements CityDubboService {

    public City findCityByName(String cityName) {
        return new City(1L,2L,"辽阳","是我的故乡");
    }
}
