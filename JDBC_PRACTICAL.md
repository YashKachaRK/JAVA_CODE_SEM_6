# 📘 Employee Management – Servlet Example

This Markdown file contains the **Servlet (`insert.java`)** used to receive form data from `index.jsp` and insert it into a MySQL database using **JDBC**.

---

## 📄 insert.jsp (HTML)

```java
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Form</title>

<!-- Tailwind CSS CDN -->
<script src="https://cdn.tailwindcss.com"></script>

</head>
<body class="bg-gray-100 min-h-screen flex items-center justify-center">

    <div class="bg-white p-8 rounded-xl shadow-lg w-full max-w-md">
        <h2 class="text-2xl font-bold text-center text-gray-800 mb-6">
            Employee Details
        </h2>

        <form action="insert" method="get" class="space-y-4">

            <!-- Employee Name -->
            <div>
                <label class="block text-gray-700 font-medium mb-1">
                    Employee Name
                </label>
                <input
                    type="text"
                    name="empname"
                    placeholder="Enter employee name"
                    required
                    class="w-full px-4 py-2 border rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-500"
                />
            </div>

            <!-- Mobile Number -->
            <div>
                <label class="block text-gray-700 font-medium mb-1">
                    Mobile Number
                </label>
                <input
                    type="tel"
                    name="mobileno"
                    placeholder="Enter mobile number"
                    pattern="[0-9]{10}"
                    required
                    class="w-full px-4 py-2 border rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-500"
                />
            </div>

            <!-- Submit Button -->
            <div>
                <button
                    type="submit"
                    class="w-full bg-blue-600 text-white py-2 rounded-lg hover:bg-blue-700 transition duration-200"
                >
                    Submit
                </button>
            </div>

        </form>
    </div>

</body>
</html>
```
## 📄 insert.java (Servlet)

```java
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

```

