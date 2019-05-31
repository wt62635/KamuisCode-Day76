package web;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//加载和实例化
public class SomeServlet extends HttpServlet{
	public SomeServlet() {
		System.out.println("SomeServlet's constructor输出");
	}
	//初始化
	@Override
	public void init() throws ServletException {
		System.out.println("SomeServlet's init输出");
	}
	//调用
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("SomeServlet's doGet输出");
	}
	//销毁
	@Override
	public void destroy() {
		System.out.println("SomeServlet's destroy输出");
	}

	public void service1(HttpServletRequest request,HttpServletResponse response) throws ServerException,IOException{
		System.out.println("SomeServlet's service输出");
		/*
		 * 通过继承自GenericServlet提供的方法来获得ServletConfig对象。
		 */
		ServletConfig config = getServletConfig();
		System.out.println(config);
		/*
		 * 使用ServletConfig对象提供的方法来读取初始化参数。
		 */
		String company = config.getInitParameter("company");
		System.out.println(company);
	}
}
