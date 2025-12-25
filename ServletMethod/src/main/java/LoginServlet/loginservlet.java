package LoginServlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 * Servlet implementation class loginservlet
 */
@WebServlet("/loginservlet")
public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final int ArrayList = 0;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginservlet() {
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
		doGet(request, response);
		
		response.setContentType("text/html");
		
		// get data to jsp file
		
		String username  = request.getParameter("username");
		String password = request.getParameter("password");
		
		PrintWriter pw  = response.getWriter();
		
		// Validation 
		
		if ("Yash".equals(username) && "12345".equals(password)) {
			LocalDateTime now = LocalDateTime.now();
			DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			
			String currentLogin = now.format(dateTimeFormatter);
			
			// session start
			
			HttpSession  session = request.getSession();
			
			ArrayList<String> loginhistory =(ArrayList<String>)session.getAttribute("loginhistory");
			
			if(loginhistory == null) {
				loginhistory = new ArrayList<String>();
				
				
				
			}
			loginhistory.add(currentLogin);
			session.setAttribute("loginhistory", loginhistory);
			request.setAttribute("username", username);
			
			request.getRequestDispatcher("Welcom").forward(request, response);
			
			
		}
		else {
			response.getWriter().println("invalid user name and password <a href='index.jsp'>Try Again</a> ");
		}
	}

}
