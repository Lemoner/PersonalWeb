package com.lmr.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lmr.dao.MoodLogDao;
import com.lmr.entity.MoodLog;

/**
 * 说说业务层
 */
@Service
public class DarlingService {
	
	/**
	 * 日志对象
	 */
	private Logger logger=LoggerFactory.getLogger(this.getClass());
	
	/**
	 * 
	 */
	@Autowired
	private MoodLogDao moodLogDao;
	
	/**
	 * 发布说说
	 * @param moodLog
	 * @return
	 */
	public int publishMood(MoodLog moodLog){
		
		return moodLogDao.insertMoodLog(moodLog);
		
	}
	
	/**
	 * 获取全部说说
	 * @return
	 */
	public List<MoodLog> getMoodLogAll() {
		return moodLogDao.queryAll();
	}
	
	

}
