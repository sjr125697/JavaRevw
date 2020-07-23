package cn.zahou.SJR.dao.impl;

import cn.zahou.SJR.bean.User;
import cn.zahou.SJR.dao.BasicDao;
import cn.zahou.SJR.dao.UserDao;

public class UserDaolmpl implements UserDao {
	BasicDao basicDao=new BasicDao();
	@Override
	public User checkUsernameAndPassword(String username, String password) {
		String sql="select id,username,password,email from users where username=? and password=?";
//		调用BasicDao中获取一个对象的方法
		User bean=basicDao.getBean(User.class,sql,username,password);
		return bean;
	}

}
