package com.jike.weblog.service.prototype;

import com.jike.weblog.entity.AgentPV;
import com.jike.weblog.entity.MonthPV;

import java.util.List;

public interface MonthPVService {
    List<MonthPV> findAll();
}
