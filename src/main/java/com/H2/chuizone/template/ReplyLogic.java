package com.h2.chuizone.template;

import java.util.ArrayList;
import java.util.List;

import com.h2.chuizone.common.reply.model.dto.ReplyDto;

public class ReplyLogic {
	public List<ReplyDto> Reply(List<ReplyDto> cList, List<ReplyDto> dstList, List<ReplyDto> processList, int dept) {
		for(ReplyDto c : processList) {			
			c.setDepts(dept);
			dstList.add(c);
			Reply(cList, dstList, getCommentList(cList, c.getReplyNo()), dept+1);
		}
		
		return dstList;
	}
	
	public List<ReplyDto> getCommentList(List<ReplyDto> cList, Integer id) {
		List<ReplyDto> rList = new ArrayList<>();
		
		for(ReplyDto c : cList) {
			if(c.getParentReplyNo() == id) {				
				rList.add(c);
			}
		}
		
		return rList;
	}
}
