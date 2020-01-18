//package servlet_examples;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloWorld extends HttpServlet {
	
	int count = 0;
	
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			                         throws ServletException, IOException {
		doPost(req, res);

	}

	public void doPost(HttpServletRequest req, HttpServletResponse res)
			                          throws ServletException, IOException {

		res.setContentType("text/html; charset=Big5");
		PrintWriter out = res.getWriter();

//清理快取
res.setHeader("Cache-Control","no-store"); //HTTP 1.1
res.setHeader("Pragma","no-cache"); //HTTP1.0
res.setDateHeader("Expires", 0);

		out.println("<HTML>");
		out.println("<HEAD><TITLE>Hello World</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("<BIG>Hello World2 , 世界你好 !</BIG>="+(++count));
		out.println("</BODY></HTML>");
	}
}