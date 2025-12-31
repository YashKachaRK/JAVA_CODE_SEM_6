<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    
<%@ page import="java.sql.*" %>

<%
		// get id 
		String id = request.getParameter("id");
		String empname = "";
		String mobileno = "";
		// check karva nu id null chhe k nai
		if(id != null){
			try{
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				// Connection 
				
				Connection conn = DriverManager.getConnection(
					    "jdbc:mysql://localhost:3306/employee",
					    "root",
					    ""
					);
				
				//Create SQL Statement
			PreparedStatement ps = conn.prepareStatement(
				    "SELECT * FROM empdata WHERE id = ?"
				);

				ps.setInt(1, Integer.parseInt(id));
				ResultSet rs = ps.executeQuery();
				
				 if (rs.next()) {
	                empname = rs.getString("empname");
	                mobileno = rs.getString("mobileno");
	            } else {
	                response.sendRedirect("home.jsp"); // ID not found
	            }
				rs.close();
				ps.close();
				conn.close();
				
			}catch(Exception e){
				out.println("Error: " + e.getMessage());
			}
		}else{
			response.sendRedirect("home.jsp");
		}
	
	%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Employee</title>
<script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-gray-100 min-h-screen flex items-center justify-center">

<div class="bg-white p-8 rounded-xl shadow-lg w-full max-w-md">
    <h2 class="text-2xl font-bold text-center text-gray-800 mb-6">
        Update Employee
    </h2>

    <form action="update_action.jsp" method="get" class="space-y-4">
        <input type="hidden" name="id" value="<%= id %>" />

        <!-- Employee Name -->
        <div>
            <label class="block text-gray-700 font-medium mb-1">Employee Name</label>
            <input
                type="text"
                name="empname"
                value="<%= empname %>"
                required
                class="w-full px-4 py-2 border rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-500"
            />
        </div>

        <!-- Mobile Number -->
        <div>
            <label class="block text-gray-700 font-medium mb-1">Mobile Number</label>
            <input
                type="tel"
                name="mobileno"
                value="<%= mobileno %>"
                pattern="[0-9]{10}"
                required
                class="w-full px-4 py-2 border rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-500"
            />
        </div>

        <!-- Buttons -->
        <div class="flex space-x-2">
            <button
                type="submit"
                class="w-full bg-blue-600 text-white py-2 rounded-lg hover:bg-blue-700 transition duration-200"
            >
                Update
            </button>

            <button
                type="button"
                onclick="window.location.href='employees.jsp';"
                class="w-full bg-gray-500 text-white py-2 rounded-lg hover:bg-gray-600 transition duration-200"
            >
                Back
            </button>
        </div>
    </form>
</div>

</body>
</html>