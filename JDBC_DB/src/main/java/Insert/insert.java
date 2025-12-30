package Insert;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


/**
 * Servlet implementation class insert
 */
@WebServlet("/insert")
public class insert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public insert() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		 	response.setContentType("text/html");
		 
		 	PrintWriter pw = response.getWriter();
			String empname  = request.getParameter("empname");
			String empmobile = request.getParameter("mobileno");

			try {
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				// Connection 
				
				Connection conn = DriverManager.getConnection(
					    "jdbc:mysql://localhost:3306/employee",
					    "root",
					    ""
					);
				
				//Create SQL Statement
				PreparedStatement ps = conn.prepareStatement(
					    "insert into empdata (empname , mobileno) values (? , ?)"
					);
				
				// For Data Set
				ps.setString(1,empname);
				ps.setString(2, empmobile);
				
				
				// Execute Query
				int count = ps.executeUpdate();
				
				if(count == 1) {
					pw.println("<p>Insert Data Successfully</p>");
				}else
				{
					pw.println("<p>Insert Data Unsuccessfully</p>");
				}
				
			}catch(Exception e) {
				pw.println(e);
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
