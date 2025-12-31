<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<!-- import java sqlile   --> 
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		// get id 
		String id = request.getParameter("id");
		
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
					    "delete from empdata where id = ?"
					);
				
				ps.setInt(1, Integer.parseInt(id));
				ps.executeUpdate();
				
				ps.close();
				conn.close();
				
				//
				response.sendRedirect("home.jsp");
				
			}catch(Exception e){
				out.println("Error: " + e.getMessage());
			}
		}else{
			response.sendRedirect("home.jsp");
		}
	
	%>
</body>
</html>