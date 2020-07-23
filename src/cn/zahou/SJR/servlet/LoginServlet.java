package cn.zahou.SJR.servlet;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.zahou.SJR.bean.User;
import cn.zahou.SJR.dao.UserDao;
import cn.zahou.SJR.dao.impl.UserDaolmpl;
/*
 * 处理用户登陆的Servlet
 * 
 * */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doGet(request, response);
		System.out.println("method[Post]!!!");

		/*
		 * POST请求的请求中文乱码问题的解决方案
		 * 在第一次请求之前设置编码集为UTF-8
		 * 1.设置编码格式,必须要在getParameter之前设置
		 * 2.获取请求参数
		 * */
		request.setCharacterEncoding("UTF-8");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
//		创建UserDao对象
		UserDao userDao=new UserDaolmpl();
		User user = userDao.checkUsernameAndPassword(username, password);
		if(user!=null) {
//			用户名和密码正确，重新定向到登陆页面
			response.sendRedirect(request.getContextPath()+"/pages/Success.jsp");
//			System.out.println(request.getContextPath());

		}
		else {
//		 	密码错误转到页面
//			request.setAttribute("msg", "用户名或密码不正确！");
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/pages/404.jsp");

			requestDispatcher.forward(request, response);

		}

	}

}
