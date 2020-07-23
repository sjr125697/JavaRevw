package cn.zahou.SJR.test;


import org.junit.jupiter.api.Test;

import cn.zahou.SJR.bean.User;
import cn.zahou.SJR.dao.UserDao;
import cn.zahou.SJR.dao.impl.UserDaolmpl;

class UserDaoTest {
UserDao userDao=new UserDaolmpl();
	@Test
	void testCheckUsernameAndPassword() {
	User user = userDao.checkUsernameAndPassword("admin", "admin");
	System.out.println(user);
	}

}
