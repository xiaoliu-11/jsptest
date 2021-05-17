package com.example.jsptest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class City {


    private Integer id;
    private Integer fatherID;
    private Integer cityID;
    private String city;
}
