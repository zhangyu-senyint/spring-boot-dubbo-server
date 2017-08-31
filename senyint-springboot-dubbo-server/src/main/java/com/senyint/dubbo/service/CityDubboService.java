package com.senyint.dubbo.service;

import com.senyint.dubbo.entity.City;

public interface CityDubboService {

    /**
     * 根据城市名称，查询城市信息
     * @param cityName
     */
    City findCityByName(String cityName);
}
