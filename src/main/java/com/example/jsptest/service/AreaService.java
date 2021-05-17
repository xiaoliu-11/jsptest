package com.example.jsptest.service;


import com.example.jsptest.entity.Area;
import com.example.jsptest.entity.City;
import com.example.jsptest.entity.Province;
import java.util.List;

public interface AreaService {

    List<Province> getProvinces();

    List<City> getCity(String province);

    List<Area> getArea(String city);

}
