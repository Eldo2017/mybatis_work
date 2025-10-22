package com.mybatis.member.dto;

import java.sql.Date;

public class Reply {
	private int replyNo;
    private int boardNo;
    private String replyWriter;
    private String replyContent;
    private Date createDate;
    private String status;
    
	public Reply() {

	}

	public Reply(int replyNo, int boardNo, String replyWriter, String replyContent, Date createDate, String status) {
		super();
		this.replyNo = replyNo;
		this.boardNo = boardNo;
		this.replyWriter = replyWriter;
		this.replyContent = replyContent;
		this.createDate = createDate;
		this.status = status;
	}

	public int getReplyNo() {
		return replyNo;
	}

	public void setReplyNo(int replyNo) {
		this.replyNo = replyNo;
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getReplyWriter() {
		return replyWriter;
	}

	public void setReplyWriter(String replyWriter) {
		this.replyWriter = replyWriter;
	}

	public String getReplyContent() {
		return replyContent;
	}

	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Reply [replyNo=" + replyNo + ", boardNo=" + boardNo + ", replyWriter=" + replyWriter + ", replyContent="
				+ replyContent + ", createDate=" + createDate + ", status=" + status + "]";
	}
}
