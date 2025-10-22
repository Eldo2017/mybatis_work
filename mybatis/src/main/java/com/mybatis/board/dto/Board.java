package com.mybatis.board.dto;

import java.sql.Date;

public class Board {
	private int boardNo;
    private String title;
    private String content;
    private String writer;
    private int readCount;
    private Date createDate;
    private Date modifyDate;
    private String status;
    
	public Board() {

	}

	public Board(int boardNo, String title, String content, String writer, int readCount, Date createDate,
			Date modifyDate, String status) {
		this.boardNo = boardNo;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.readCount = readCount;
		this.createDate = createDate;
		this.modifyDate = modifyDate;
		this.status = status;
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getReadCount() {
		return readCount;
	}

	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Board [boardNo=" + boardNo + ", title=" + title + ", content=" + content + ", writer=" + writer
				+ ", readCount=" + readCount + ", createDate=" + createDate + ", modifyDate=" + modifyDate + ", status="
				+ status + "]";
	}   
}
