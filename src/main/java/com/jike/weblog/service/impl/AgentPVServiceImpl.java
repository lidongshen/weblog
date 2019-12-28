package com.jike.weblog.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jike.weblog.dao.AgentPVDao;
import com.jike.weblog.dao.DayPVDao;
import com.jike.weblog.entity.AgentPV;
import com.jike.weblog.entity.DayPV;
import com.jike.weblog.service.prototype.AgentPVService;
import com.jike.weblog.service.prototype.DayPVService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AgentPVServiceImpl implements AgentPVService {
    @Resource
    private AgentPVDao agentDao;


    @Override
    public List<AgentPV> findAll() {
        Page<AgentPV> objects = PageHelper.startPage(1, 5);
        List<AgentPV> all = agentDao.findAll();
        return all;
    }
}
