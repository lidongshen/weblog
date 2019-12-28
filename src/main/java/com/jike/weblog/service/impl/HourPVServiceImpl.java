package com.jike.weblog.service.impl;

import com.jike.weblog.dao.HourPVDao;
import com.jike.weblog.entity.HourPV;
import com.jike.weblog.service.prototype.HourPVService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HourPVServiceImpl implements HourPVService {
    @Resource
    private HourPVDao hourDao;


    @Override
    public List<HourPV> findAll() {
        return hourDao.findAll();
    }

}
