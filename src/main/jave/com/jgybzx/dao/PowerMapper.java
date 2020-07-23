package com.jgybzx.dao;

import com.jgybzx.model.Power;

public interface PowerMapper {
    int deleteByPrimaryKey(String id);

    int insert(Power record);

    int insertSelective(Power record);

    Power selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Power record);

    int updateByPrimaryKey(Power record);
}