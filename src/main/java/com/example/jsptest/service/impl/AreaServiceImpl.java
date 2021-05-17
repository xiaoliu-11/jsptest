package com.example.jsptest.service.impl;


import com.example.jsptest.dao.AreaDao;
import com.example.jsptest.entity.Area;
import com.example.jsptest.entity.City;
import com.example.jsptest.entity.Province;

import com.example.jsptest.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    private AreaDao areaDao;

    @Override
    public List<Province> getProvinces() {
        return areaDao.getProvinces();
    }

    @Override
    public List<City> getCity(String province) {
        return areaDao.getCitys(province);
    }

    @Override
    public List<Area> getArea(String city) {
        return areaDao.getAreas(city);
    }
}
