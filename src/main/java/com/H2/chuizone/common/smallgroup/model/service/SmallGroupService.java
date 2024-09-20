package com.h2.chuizone.common.smallgroup.model.service;

import java.util.List;

import com.h2.chuizone.common.smallgroup.model.vo.SmallGroup;

public interface SmallGroupService {
	List<SmallGroup> selectSmallGroupList();
	
	SmallGroup selectSmallGroup(String smallGroupName);
}
