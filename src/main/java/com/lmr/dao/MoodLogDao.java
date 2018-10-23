package com.lmr.dao;

import org.apache.ibatis.annotations.Param;

import com.lmr.entity.MoodLog;

/**
 * 说说相关的数据库操作接口
 */
public interface MoodLogDao {

	/**
	 */
	public int insertMoodLog(@Param("moodLog") MoodLog moodLog);
	
}
