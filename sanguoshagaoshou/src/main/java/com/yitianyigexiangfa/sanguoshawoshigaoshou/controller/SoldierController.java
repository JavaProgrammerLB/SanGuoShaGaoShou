package com.yitianyigexiangfa.sanguoshawoshigaoshou.controller;

import com.yitianyigexiangfa.sanguoshawoshigaoshou.domain.Soldier;
import com.yitianyigexiangfa.sanguoshawoshigaoshou.mapper.SoldierMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liubei on 2017/5/3.
 */
@RestController
public class SoldierController {

    @Autowired
    private SoldierMapper soldierMapper;

    @RequestMapping("/soldier")
    public String listSoldier(@RequestParam(value="name", defaultValue = "刘备") String name){
//        return soldierMapper.findByName("刘备").toString();
        return "h";
    }

    @RequestMapping("/greeting")
    public Soldier greeting(@RequestParam(value="name", defaultValue = "刘备") String name){
        return soldierMapper.findByName("刘备");
    }
}
