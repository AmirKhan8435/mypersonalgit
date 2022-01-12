package study.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import study.dao.CustomerDAO;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/addservlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
  
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String address = request.getParameter("address");
		
		
		CustomerDAO dao = new CustomerDAO();
		dao.addPerson(fname, lname, address);
	}

}
