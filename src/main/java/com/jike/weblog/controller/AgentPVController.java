package com.jike.weblog.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;
import com.jike.weblog.entity.AgentPV;
import com.jike.weblog.entity.DayPV;
import com.jike.weblog.service.prototype.AgentPVService;
import com.jike.weblog.service.prototype.DayPVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AgentPVController {
    @Autowired
    private AgentPVService agentService;

    @RequestMapping(value = "/getagentall",method = RequestMethod.GET)
    @ResponseBody
    public String getAll(){
        Page<AgentPV> agents = (Page <AgentPV>)agentService.findAll();
        System.out.println(agents.getTotal()+"-"+agents.getPages());
        return JSON.toJSONString(agents);
    }

}
