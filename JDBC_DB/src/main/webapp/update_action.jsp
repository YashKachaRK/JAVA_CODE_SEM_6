<%@ page import="java.sql.*" %>
<%
    String id = request.getParameter("id");
    String empname = request.getParameter("empname");
    String mobileno = request.getParameter("mobileno");

    if (id != null && empname != null && mobileno != null) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/employee",
                "root",
                ""
            );

            PreparedStatement ps = conn.prepareStatement(
                "UPDATE empdata SET empname=?, mobileno=? WHERE id=?"
            );
            ps.setString(1, empname);
            ps.setString(2, mobileno);
            ps.setInt(3, Integer.parseInt(id));

            ps.executeUpdate();
            ps.close();
            conn.close();

            response.sendRedirect("home.jsp"); // back to employee list
        } catch (Exception e) {
            out.println("Error: " + e.getMessage());
        }
    } else {
        response.sendRedirect("home.jsp");
    }
%>
