package com.lmr.dao;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lmr.entity.MoodLog;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class TestMoodLogDao {

	@Resource
	private MoodLogDao moodLogDao;

	@Test
	public void Fun(){
		
		MoodLog mood=new MoodLog();
		mood.setUser("ad");
		mood.setMoodText("李梦然18767137693401103554@qq.com");
		mood.setPublishTime(new Date());
		
		System.out.println(mood.toString());
		
		System.out.println("-----------");
		
		moodLogDao.insertMoodLog(mood);
	}
	
	@Test
	public void FunQuery(){
		List<MoodLog> list=moodLogDao.queryAll();
		System.out.println(list.size());
		for(MoodLog moodLog:list){
			System.out.println(moodLog.toString());
		}
	}
	
}
