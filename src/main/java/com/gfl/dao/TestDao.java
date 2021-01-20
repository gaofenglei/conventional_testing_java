package com.gfl.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gfl.entity.TestEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TestDao extends BaseMapper<TestEntity> {

    @Select(" select * from orders ")
    List<TestEntity> select();

}
