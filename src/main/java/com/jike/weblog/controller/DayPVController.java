package com.jike.weblog.controller;

import com.alibaba.fastjson.JSON;
import com.jike.weblog.entity.DayPV;
import com.jike.weblog.service.prototype.DayPVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DayPVController {
    @Autowired
    private DayPVService dayService;

    @RequestMapping(value = "/getdayall",method = RequestMethod.GET)
    @ResponseBody
    public String getAll(){
        List<DayPV> days = dayService.findAll();
        return JSON.toJSONString(days);
    }

}
