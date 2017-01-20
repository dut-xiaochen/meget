package com.kuaidian.weget.mapper;

import com.kuaidian.weget.domain.Material;
import com.kuaidian.weget.domain.MaterialWithBLOBs;

public interface MaterialMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MaterialWithBLOBs record);

    int insertSelective(MaterialWithBLOBs record);

    MaterialWithBLOBs selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MaterialWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MaterialWithBLOBs record);

    int updateByPrimaryKey(Material record);
}