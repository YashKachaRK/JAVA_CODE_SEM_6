package Welcom;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Servlet implementation class Welcom
 */
@WebServlet("/Welcom")
public class Welcom extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Welcom() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		HttpSession session = request.getSession();
		// retruve session friok loginServlet
		ArrayList<String> loginhistory = (ArrayList<String>)session.getAttribute("loginhistory");
		
		// get username from loginservlet page
		
		String username  = (String)request.getAttribute("username");
		
		// print username and display welcome msg 
		
		pw.println("<h1> Welcome "+username+ " </h1>");
		pw.println("<h1>Login History</h1>");
		
		if(loginhistory != null && !loginhistory.isEmpty()) {
			pw.println("<ul>");
			for(String logintime:loginhistory) {
				pw.println("<li> Lofin time:- "+logintime+ "</li>");
			}
			pw.println("</ul>");
		}
		else {
			pw.println("<h2>No Login History<h2/>");
			
		}
		
		response.getWriter().println("<a href = 'Logout'> Logout </a>");
		
		
		
		
		
	}

}
