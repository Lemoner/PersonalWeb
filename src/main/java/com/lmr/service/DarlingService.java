package com.lmr.service;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lmr.dao.MoodLogDao;
import com.lmr.entity.MoodLog;

@Service
public class DarlingService {
	
	/**
	 * 日志对象
	 */
	private Logger logger=LoggerFactory.getLogger(this.getClass());
	
	/**
	 */
	@Autowired
	private MoodLogDao moodLogDao;
	
	public int publishMood(MoodLog moodLog){
		
		return moodLogDao.insertMoodLog(moodLog);
		
	}

}
