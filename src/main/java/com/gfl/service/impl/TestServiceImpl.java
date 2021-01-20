package com.gfl.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gfl.dao.TestDao;
import com.gfl.entity.TestEntity;
import com.gfl.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Resource
    private TestDao testDao;

    @Override
    public List<TestEntity> queryTest() {
        return testDao.select();
    }

    @Override
    public void addTest(TestEntity testEntity) {
        testDao.insert(testEntity);
    }

    @Override
    public TestEntity getIdByTestEntity(Integer id) {
        QueryWrapper<TestEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", id);
        return testDao.selectOne(queryWrapper);
    }

    @Override
    public void updateTest(TestEntity testEntity) {
        testDao.updateById(testEntity);
    }

    @Override
    public void deleteTest(Integer id) {
        QueryWrapper<TestEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", id);
        testDao.delete(queryWrapper);
    }
}
