package com.jike.weblog.controller;

import com.alibaba.fastjson.JSON;
import com.jike.weblog.entity.MonthPV;
import com.jike.weblog.service.prototype.MonthPVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MonthPVController {
    @Autowired
    private MonthPVService monthService;

    @RequestMapping(value = "/getmonthall",method = RequestMethod.GET)
    @ResponseBody
    public String getAll(){
        List<MonthPV> months = monthService.findAll();
        return JSON.toJSONString(months);
    }

}
