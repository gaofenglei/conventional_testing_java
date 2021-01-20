package com.gfl.controller;

import com.gfl.dao.TestDao;
import com.gfl.entity.TestEntity;
import com.gfl.service.TestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Api
@RestController
public class TestController {

    @Resource
    private TestService testService;

    @ApiOperation(value = "订单查询")
    @RequestMapping("query")
    public List<TestEntity> queryTest() {
        //无敌之审计无敌
        return testService.queryTest();
    }

    @RequestMapping("add")
    public void addTest(TestEntity testEntity) {
        //啦啦啦
        testService.addTest(testEntity);
    }

    @RequestMapping("get")
    public TestEntity getIdByTestEntity(Integer id) {
        return testService.getIdByTestEntity(id);
    }

    @RequestMapping("update")
    public void updateTest(TestEntity testEntity) {
        testService.updateTest(testEntity);
    }

    @RequestMapping("delete")
    public void deleteTest(Integer id) {
        testService.deleteTest(id);
    }
}
