package in.sterling.Controllers;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.sterling.dto.EmpDTO;
import in.sterling.models.EmpModel;
@WebServlet("/AddController")
public class AddController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String empId=request.getParameter("empId");
		String ssn=request.getParameter("ssn");
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String mobile=request.getParameter("mobile");
		String department=request.getParameter("department");
		String designtion=request.getParameter("designtion");
		String bankNo=request.getParameter("bankNo");
		String date=request.getParameter("date");
		String jdate=request.getParameter("jdate");
		
		EmpDTO dto=new EmpDTO();
		dto.setBankNo(bankNo);
		dto.setDate(date);
		dto.setDepartment(department);
		dto.setDesigntion(designtion);
		dto.setFname(fname);
		dto.setJdate(jdate);
		dto.setLname(lname);
		dto.setMobile(mobile);
		dto.setSsn(ssn);
		dto.setEmpId(empId);
		
		EmpModel em=new EmpModel();
		RequestDispatcher rd=request.getRequestDispatcher("Dashboard");
		if(em.addEmp(dto))
		{
			request.setAttribute("status", "Employee Added Successfully");
			rd.forward(request, response);
		}
		else
		{
			request.setAttribute("status", "Something Wrong");
			rd.forward(request, response);
		}
	}

}
