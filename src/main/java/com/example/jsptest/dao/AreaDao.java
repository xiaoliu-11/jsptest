package com.example.jsptest.dao;


import com.example.jsptest.entity.Area;
import com.example.jsptest.entity.City;
import com.example.jsptest.entity.Province;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AreaDao {

    public List<Province> getProvinces();
    public List<City> getCitys(String province);
    public List<Area> getAreas(String city);


}
