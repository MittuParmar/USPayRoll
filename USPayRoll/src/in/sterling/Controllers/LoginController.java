package in.sterling.Controllers;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uid = request.getParameter("uid");
		String pwd = request.getParameter("pwd");
		if(uid.equals("mittu")&&pwd.equals("mittu"))
		{
			RequestDispatcher rd = request.getRequestDispatcher("Dashboard");
			request.setAttribute("uid", uid);
			rd.include(request, response);
		}
	}

}
