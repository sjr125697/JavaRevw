package cn.zahou.SJR.dao;

import cn.zahou.SJR.bean.User;

public interface UserDao {
	/*
	 * 根据用户名和密码从数据库中查询对应的记录
	 * @Param username
	 * @Param password
	 * @return User有记录 null 无记录
	 * */
User checkUsernameAndPassword(String username,String password);
}
