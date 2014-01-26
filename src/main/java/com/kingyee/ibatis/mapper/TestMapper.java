package com.kingyee.ibatis.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;

public interface TestMapper {
	List sel();
	
	@Select("select * from cms_admin where userid=#{i}")
	Map selFromID(Integer i);
}
