package com.jike.weblog.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jike.weblog.dao.DayPVDao;
import com.jike.weblog.entity.DayPV;
import com.jike.weblog.entity.HourPV;
import com.jike.weblog.service.prototype.DayPVService;
import com.jike.weblog.service.prototype.HourPVService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DayPVServiceImpl implements DayPVService {
    @Resource
    private DayPVDao dayDao;


    @Override
    public List<DayPV> findAll() {
        Page<DayPV> objects = PageHelper.startPage(1, 5);
        List<DayPV> all = dayDao.findAll();
        return all;
    }
}
