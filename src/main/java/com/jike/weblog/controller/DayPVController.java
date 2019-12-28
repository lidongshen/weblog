package com.jike.weblog.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;
import com.jike.weblog.entity.DayPV;
import com.jike.weblog.entity.HourPV;
import com.jike.weblog.service.prototype.DayPVService;
import com.jike.weblog.service.prototype.HourPVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DayPVController {
    @Autowired
    private DayPVService dayService;

    @RequestMapping(value = "/getdayall",method = RequestMethod.GET)
    @ResponseBody
    public String getAll(){
        Page<DayPV> days = (Page <DayPV>)dayService.findAll();
        System.out.println(days.getTotal()+"-"+days.getPages());
        return JSON.toJSONString(days);
    }

}
