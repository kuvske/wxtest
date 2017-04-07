package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import check.check_begin;

/**
 * Servlet implementation class weixservlet
 */
public class weixservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public weixservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String signature = request.getParameter("signature");
		String timestamp = request.getParameter("timestamp");
		String nonce= request.getParameter("nonce");
		String echostr=request.getParameter("echostr");
		String token ="zsweix";
		
		PrintWriter out =response.getWriter();
	   check_begin cb = new check_begin();
	  String myechostr= cb.check_now(token, timestamp, nonce);
		System.out.println("自己得到的加密信息："+myechostr);
		System.out.println("传递过来的加密信息："+signature);
	 if(myechostr.equals(signature)){
		 out.print(echostr);
	 }else{
		 out.print("1");
	 }
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
