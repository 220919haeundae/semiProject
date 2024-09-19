package com.H2.chuizone.customerServicePage.model.vo;

public class Board {
	private String boardNo;
	private String userNo;
	private String boardType;
	private String boardTitle;
	private String createDate;
	private String boardContent;
	private String originFileNames;
	private String changeFileNames;
	@Override
	public String toString() {
		return "Board [boardNo=" + boardNo + ", userNo=" + userNo + ", boardType=" + boardType + ", boardTitle="
				+ boardTitle + ", createDate=" + createDate + ", boardContent=" + boardContent + ", originFileNames="
				+ originFileNames + ", changeFileNames=" + changeFileNames + "]";
	}
	
	public Board() {};
	

	public Board(String boardNo, String userNo, String boardType, String boardTitle, String createDate,
			String boardContent, String originFileNames, String changeFileNames) {
		super();
		this.boardNo = boardNo;
		this.userNo = userNo;
		this.boardType = boardType;
		this.boardTitle = boardTitle;
		this.createDate = createDate;
		this.boardContent = boardContent;
		this.originFileNames = originFileNames;
		this.changeFileNames = changeFileNames;
	}

	
	public String getOriginFileNames() {
		return originFileNames;
	}

	public void setOriginFileNames(String originFileNames) {
		this.originFileNames = originFileNames;
	}

	public String getBoardType() {
		return boardType;
	}

	public void setBoardType(String boardType) {
		this.boardType = boardType;
	}
	
	public String getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(String boardNo) {
		this.boardNo = boardNo;
	}

	public String getUserNo() {
		return userNo;
	}

	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}

	public String getBoardTitle() {
		return boardTitle;
	}

	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getBoardContent() {
		return boardContent;
	}

	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}

	public String getChangeFileNames() {
		return changeFileNames;
	}

	public void setChangeFileNames(String changeFileNames) {
		this.changeFileNames = changeFileNames;
	}
	
}
