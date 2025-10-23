package com.mybatis.board.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import com.mybatis.board.dto.Board;
import com.mybatis.board.dto.Reply;
import com.mybatis.board.service.BoardService;
import com.mybatis.board.service.BoardServiceImpl;
import com.mybatis.common.dto.PageInfo;
import com.mybatis.common.template.Paging_ex;

@WebServlet("/detail.bo")
public class BoardDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BoardService bservice = new BoardServiceImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int nowPage = 1;
		if(request.getParameter("nowPage") != null) {
			nowPage = Integer.parseInt(request.getParameter("nowPage"));
		}
		
		int boardNo = Integer.parseInt(request.getParameter("bno"));
		
		int res = bservice.increaseCount(boardNo);

		if(res > 0) {
			Board b = bservice.selectBoard(boardNo);
			System.out.println(b.getBoardTitle());
			
			int replyRecord = bservice.replyRecord(boardNo);
			PageInfo pi = Paging_ex.getPageInfo(replyRecord, nowPage, 5, 2);
			System.out.println("댓글 개수 : " + replyRecord);
			
			ArrayList<Reply> list = bservice.selectReplyList(boardNo, pi);
			System.out.println("댓글 리스트 개수 : " + list.size());
		}
	}

}
