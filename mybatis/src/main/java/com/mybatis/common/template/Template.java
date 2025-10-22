package com.mybatis.common.template;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Template {
	public static SqlSession getSqlSession() {
		SqlSession sqlSession = null;
		String resource = "/mybatis-config.xml";
		
		try {
			InputStream st = Resources.getResourceAsStream(resource);
			sqlSession = new SqlSessionFactoryBuilder().build(st).openSession(false);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return sqlSession;
	}
	/*
	 * Connection
	 * 
	 * close
	 * 
	 * commit | rollback
	 */
}
