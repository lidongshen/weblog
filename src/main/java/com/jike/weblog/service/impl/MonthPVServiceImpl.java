package com.jike.weblog.service.impl;

import com.jike.weblog.dao.MonthPVDao;
import com.jike.weblog.entity.MonthPV;
import com.jike.weblog.service.prototype.MonthPVService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MonthPVServiceImpl implements MonthPVService {
    @Resource
    private MonthPVDao monthDao;


    @Override
    public List<MonthPV> findAll() {
        List<MonthPV> all = monthDao.findAll();
        return all;
    }
}
