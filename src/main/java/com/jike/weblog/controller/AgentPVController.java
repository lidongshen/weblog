package com.jike.weblog.controller;

import com.alibaba.fastjson.JSON;
import com.jike.weblog.entity.AgentPV;
import com.jike.weblog.service.prototype.AgentPVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AgentPVController {
    @Autowired
    private AgentPVService agentService;

    @RequestMapping(value = "/getagentall",method = RequestMethod.GET)
    @ResponseBody
    public String getAll(){
        List<AgentPV> agents = agentService.findAll();
        return JSON.toJSONString(agents);
    }

}
