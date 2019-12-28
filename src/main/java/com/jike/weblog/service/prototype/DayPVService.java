package com.jike.weblog.service.prototype;

import com.jike.weblog.entity.DayPV;
import com.jike.weblog.entity.HourPV;

import java.util.List;

public interface DayPVService {
    List<DayPV> findAll();
}
