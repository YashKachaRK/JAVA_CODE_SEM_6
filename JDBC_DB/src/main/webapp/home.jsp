<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee List</title>

<!-- Tailwind CSS CDN -->
<script src="https://cdn.tailwindcss.com"></script>

</head>
<body class="bg-gray-100 min-h-screen p-6">

    <div class="max-w-6xl mx-auto bg-white shadow-lg rounded-xl p-6">
        
        <h1 class="text-3xl font-bold text-center text-gray-800 mb-6">
            Employee Records
        </h1>

        <!-- Table -->
        <div class="overflow-x-auto">
            <table class="min-w-full border border-gray-200 rounded-lg">
                <thead class="bg-blue-600 text-white">
                    <tr>
                        <th class="py-3 px-4 text-left">ID</th>
                        <th class="py-3 px-4 text-left">Employee Name</th>
                        <th class="py-3 px-4 text-left">Mobile Number</th>
                        <th class="py-3 px-4 text-center">Actions</th>
                    </tr>
                </thead>
                <tbody class="text-gray-700">

                    <%
                        try {
                            Class.forName("com.mysql.cj.jdbc.Driver");

                            Connection conn = DriverManager.getConnection(
                                "jdbc:mysql://localhost:3306/employee",
                                "root",
                                ""
                            );

                            PreparedStatement ps = conn.prepareStatement(
                                "SELECT * FROM empdata"
                            );

                            ResultSet rs = ps.executeQuery();

                            while(rs.next()) {
                    %>

                    <tr class="border-b hover:bg-gray-100">
                        <td class="py-3 px-4"><%= rs.getInt("id") %></td>
                        <td class="py-3 px-4"><%= rs.getString("empname") %></td>
                        <td class="py-3 px-4"><%= rs.getString("mobileno") %></td>
                        <td class="py-3 px-4 text-center space-x-2">

                            <!-- Update Button -->
                            <a href="<% rs.getInt("id"); %>" class="bg-yellow-500 text-white px-4 py-1 rounded-lg hover:bg-yellow-600 transition">
                                Update
                            </a>

                            <!-- Delete Button -->
                            <a href="" onclick="return confirm('Are you sure you want to delete?');"
                               class="bg-red-600 text-white px-4 py-1 rounded-lg hover:bg-red-700 transition">
                                Delete
                            </a>

                        </td>
                    </tr>

                    <%
                            }
                            rs.close();
                            ps.close();
                            conn.close();
                        } catch(Exception e) {
                    %>
                        <tr>
                            <td colspan="4" class="text-center py-4 text-red-600">
                                <%= e.getMessage() %>
                            </td>
                        </tr>
                    <%
                        }
                    %>

                </tbody>
            </table>
        </div>

        

    </div>

</body>
</html>
