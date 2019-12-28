package com.jike.weblog.service.impl;

import com.jike.weblog.dao.AgentPVDao;
import com.jike.weblog.entity.AgentPV;
import com.jike.weblog.service.prototype.AgentPVService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AgentPVServiceImpl implements AgentPVService {
    @Resource
    private AgentPVDao agentDao;


    @Override
    public List<AgentPV> findAll() {
        List<AgentPV> all = agentDao.findAll();
        return all;
    }
}
