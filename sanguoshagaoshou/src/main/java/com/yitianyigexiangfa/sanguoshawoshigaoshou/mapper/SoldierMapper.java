package com.yitianyigexiangfa.sanguoshawoshigaoshou.mapper;

import com.yitianyigexiangfa.sanguoshawoshigaoshou.domain.Soldier;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by liubei on 2017/5/3.
 */
@Mapper
public interface SoldierMapper {
    @Select("select * from soldier where name = #{name}")
    Soldier findByName(@Param("name") String name);
}
