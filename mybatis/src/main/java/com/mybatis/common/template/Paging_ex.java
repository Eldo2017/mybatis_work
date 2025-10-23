package com.mybatis.common.template;

import com.mybatis.common.dto.PageInfo;

public class Paging_ex {
	public static PageInfo getPageInfo(int totalRecord, int nowPage, int numperPage, int pagePerBlock) {
		int totalPage = (int)Math.ceil(totalRecord / (double)numperPage);
		int startPage = (nowPage-1) / pagePerBlock * pagePerBlock + 1; // 페이징 바 시작 수
		int endPage = startPage + pagePerBlock - 1; // 페이징 바 끝 수
		
		if(endPage > totalPage) {
			endPage = totalPage;
		}
		
		return new PageInfo(totalRecord,nowPage,numperPage,pagePerBlock,totalPage,startPage,endPage);
	}
}
