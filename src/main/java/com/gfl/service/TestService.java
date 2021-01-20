package com.gfl.service;

import com.gfl.dao.TestDao;
import com.gfl.entity.TestEntity;

import java.util.List;

public interface TestService {
    List<TestEntity> queryTest();

    void addTest(TestEntity testEntity);

    TestEntity getIdByTestEntity(Integer id);

    void updateTest(TestEntity testEntity);

    void deleteTest(Integer id);
}
