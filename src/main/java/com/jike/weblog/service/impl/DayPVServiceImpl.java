package com.jike.weblog.service.impl;

import com.jike.weblog.dao.DayPVDao;
import com.jike.weblog.entity.DayPV;
import com.jike.weblog.service.prototype.DayPVService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DayPVServiceImpl implements DayPVService {
    @Resource
    private DayPVDao dayDao;


    @Override
    public List<DayPV> findAll() {
        List<DayPV> all = dayDao.findAll();
        return all;
    }
}
