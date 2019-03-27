package com.cll.crm.mapper;

import java.util.List;

import com.cll.crm.pojo.BaseDict;

public interface BaseDictDao {

	
	//查询
	public List<BaseDict> selectBaseDictListByCode(String code);
}
