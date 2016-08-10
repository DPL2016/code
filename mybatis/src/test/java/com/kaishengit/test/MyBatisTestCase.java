package com.kaishengit.test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.kaishengit.pojo.User;
import com.kaishengit.util.MyBatisUtil;

public class MyBatisTestCase {
	private Logger logger = LoggerFactory.getLogger(MyBatisTestCase.class);

	@Test
	public void testFindAll() {
		
			SqlSession sqlSession =MyBatisUtil.getSqlSession();
			List<User> userList = sqlSession.selectList("com.kaishengit.mapper.UserMapper.findAll");
			for (User user : userList) {
				logger.debug("{}", user);
			}
			sqlSession.close();
		} 

	}
