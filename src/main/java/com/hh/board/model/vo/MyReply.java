package com.hh.board.model.vo;

public class MyReply {
	private String title;
	private String reply;
	private String boardNo;
	private String img;
	
	public MyReply() {}

	public MyReply(String title, String reply, String boardNo, String img) {
		super();
		this.title = title;
		this.reply = reply;
		this.boardNo = boardNo;
		this.img = img;
	}

	@Override
	public String toString() {
		return "MyReply [title=" + title + ", reply=" + reply + ", boardNo=" + boardNo + ", img=" + img + "]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getReply() {
		return reply;
	}

	public void setReply(String reply) {
		this.reply = reply;
	}

	public String getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(String boardNo) {
		this.boardNo = boardNo;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}
	
}
