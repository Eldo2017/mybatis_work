package com.mybatis.member.service;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.common.template.Template;
import com.mybatis.member.dto.Member;
import com.mybatis.member.repository.MemberRepository;

public class MemberServletImpl implements MemberService {
	private MemberRepository mDao = new MemberRepository();
	private SqlSession sqlSession = Template.getSqlSession();
	
	@Override
	public int checkId(String userId) {
		int res = mDao.checkId(sqlSession, userId);
		sqlSession.close();
		return res;
	}

	@Override
	public int insertMember(Member m) {
		int res = mDao.insertMember(sqlSession, m);
		if(res == 1) {
			sqlSession.commit();
		} 
		
		sqlSession.close();
		return res;
	}
	
	@Override
	public Member loginMember(Member m) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateMember(Member m) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteMember(String userId) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
