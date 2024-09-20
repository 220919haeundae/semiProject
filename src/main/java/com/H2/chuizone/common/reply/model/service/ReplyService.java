package com.h2.chuizone.common.reply.model.service;

import java.util.List;

import com.h2.chuizone.common.reply.model.dto.ReplyDto;
import com.h2.chuizone.common.reply.model.vo.Reply;

public interface ReplyService {
	List<ReplyDto> selectReplyList(int boardId);
	
	int insertReply(Reply reply);
	
	int deleteReply(int boardId, int replyId);
	
	int updateReply(int boardId, int replyId, String content);
}
