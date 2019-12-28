package com.jike.weblog.controller;

import com.alibaba.fastjson.JSON;
import com.jike.weblog.entity.HourPV;
import com.jike.weblog.service.prototype.HourPVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HourPVController {
    @Autowired
    private HourPVService hourService;

    @RequestMapping(value = "/getHourAll",method = RequestMethod.GET)
    @ResponseBody
    public String gethourAll(){
        List<HourPV> all = hourService.findAll();
        return JSON.toJSONString(all);
    }


    @RequestMapping("/index")
    public String index(){
        return "index";
    }

}
