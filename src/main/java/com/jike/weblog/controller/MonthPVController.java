package com.jike.weblog.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;
import com.jike.weblog.entity.AgentPV;
import com.jike.weblog.entity.MonthPV;
import com.jike.weblog.service.prototype.AgentPVService;
import com.jike.weblog.service.prototype.MonthPVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MonthPVController {
    @Autowired
    private MonthPVService monthService;

    @RequestMapping(value = "/getmonthall",method = RequestMethod.GET)
    @ResponseBody
    public String getAll(){
        Page<MonthPV> months = (Page <MonthPV>)monthService.findAll();
        System.out.println(months.getTotal()+"-"+months.getPages());
        return JSON.toJSONString(months);
    }

}
