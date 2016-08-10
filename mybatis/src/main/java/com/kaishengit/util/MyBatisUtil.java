package com.kaishengit.util;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {
	private static SqlSessionFactory sessionFactory=builderSqlSessionFactory();
	private static SqlSessionFactory builderSqlSessionFactory(){
		
		try {
			Reader reader = Resources.getResourceAsReader("mybatis.xml");
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
			return sessionFactory;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}	
	}
	public static SqlSessionFactory getSqlSessionFactory(){
		return sessionFactory;
	}
	
public static SqlSession getSqlSession(){
	return getSqlSessionFactory().openSession();
}
}
