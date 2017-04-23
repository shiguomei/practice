package rj7.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import rj7.util.DAOFactory;

@WebServlet("/LogRegServ")
/**
 * 鐢ㄦ埛鍙婄鐞嗗憳鐧诲綍娉ㄥ唽servlet
 * @author 姊佺埥鐖�  2017.4.22
 *
 */
public class LogRegServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LogRegServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String dowhat = request.getParameter("dowhat");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		// 鐧诲綍
		if("log".equals(dowhat)){
			// 鑾峰彇璐﹀彿瀵嗙爜
			String username = request.getParameter("username");
			String pswd = request.getParameter("pswd");
			
			// 鐧诲綍鎴愬姛鍚庤烦杞�
			if(DAOFactory.getDaoInstance().login(username, pswd, "tbluser")!= 0) {
				request.getRequestDispatcher("index.jsp").forward(request, response);
			} 
		}
	}

}
