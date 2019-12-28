package com.jike.weblog.dao;

import com.jike.weblog.entity.AgentPV;
import com.jike.weblog.entity.DayPV;

import java.util.List;

public interface AgentPVDao {
    List<AgentPV> findAll();
}
