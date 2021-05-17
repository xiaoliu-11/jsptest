package com.example.jsptest.controller;

import com.example.jsptest.entity.Area;
import com.example.jsptest.entity.City;
import com.example.jsptest.entity.Province;

import com.example.jsptest.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AreaController {
    @Autowired
    private AreaService areaService;

    @RequestMapping("/area")
   public String toArea(){
        return "area";
    }


@RequestMapping("/getProvinces")
    public Object getProvince(ModelMap map){
        List<Province> provinces = areaService.getProvinces();
        map.addAttribute("provinces",provinces);
        return "area";
    }


    @RequestMapping(value = "/getCity/{pr_name}",method = RequestMethod.GET)
    @ResponseBody
    public Object getCity(@PathVariable("pr_name") String province){
        List<City> city = areaService.getCity(province);
        return city;
    }


    @RequestMapping(value = "/getArea/{ci_name}",method = RequestMethod.GET)
    @ResponseBody
    public Object getArae(@PathVariable("ci_name") String city){
        System.out.println(city);
        List<Area> area = areaService.getArea(city);
        for(Area area1 :area){
            System.out.println(area1);
        }
        return area;
    }





}
