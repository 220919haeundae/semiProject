package com.h2.chuizone.common.smallgroupcategory.model.service;

import java.util.List;

import com.h2.chuizone.common.smallgroupcategory.model.dto.SelectGroupCategoryDto;
import com.h2.chuizone.common.smallgroupcategory.model.vo.SmallGroupCategory;

public interface SmallGroupCategoryService {
	List<SmallGroupCategory> selectSmallGroupCategoryList();
	
	SmallGroupCategory selectSmallGroupCategory(SelectGroupCategoryDto selectGroupCategoryDto);
	
	String selectSmallGroupName(int smallGroupCategoryNo);
}
