package com.jinyinmao.info.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.jinyinmao.info.model.LogEntitys;

@Mapper
public interface LogEntitysMapper {

	@Select("SELECT * FROM dbo.LogEntitys WHERE Purchase = #{purchase} ORDER BY C_Date ASC ")
	List<LogEntitys> All(@Param("purchase") String purchase);

}
