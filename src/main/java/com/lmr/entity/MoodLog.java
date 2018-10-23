package com.lmr.entity;

import java.util.Date;

/**
 * 说说
 */
public class MoodLog {

	private int id;
	/**
	 * 发布者ID
	 */
	private int userId;
	/**
	 * 说说内容
	 */
	private String moodText;
	/**
	 * 发布时间
	 */
	private Date publishTime;
	/**
	 * 是否删除
	 */
	private boolean isDelete;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getMoodText() {
		return moodText;
	}

	public void setMoodText(String moodText) {
		this.moodText = moodText;
	}

	public Date getPublishTime() {
		return publishTime;
	}

	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}

	public boolean getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(boolean isDelete) {
		this.isDelete = isDelete;
	}

	@Override
	public String toString() {
		return "MoodLog [id=" + id + ", userId=" + userId + ", moodText=" + moodText + ", publishTime=" + publishTime
				+ ", isDelete=" + isDelete + "]";
	}

}
