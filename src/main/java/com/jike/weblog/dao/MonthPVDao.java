package com.jike.weblog.dao;

import com.jike.weblog.entity.AgentPV;
import com.jike.weblog.entity.MonthPV;

import java.util.List;

public interface MonthPVDao {
    List<MonthPV> findAll();
}
