package com.lmr.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lmr.entity.MoodLog;

/**
 * 说说相关的数据库操作接口
 */
public interface MoodLogDao {

	/**
	 * 添加说说
	 */
	public int insertMoodLog(@Param("moodLog") MoodLog moodLog);
	
	/**
	 * 列表说说
	 */
	public List<MoodLog> queryAll();
	
}
