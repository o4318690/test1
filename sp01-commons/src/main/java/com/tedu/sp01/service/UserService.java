package com.tedu.sp01.service;

import com.tedu.sp01.pojo.User;

public interface UserService {
	/**
	 * 获取用户数据
	 */
	User getUser(Integer id);
	/**
	 * 添加用户积分.刺激消费
	 */
	void addScore(Integer id,Integer score);
}
