# 📘 Employee Management – Servlet Example

This Markdown file contains the **Servlet (`insert.java`)** used to receive form data from `index.jsp` and insert it into a MySQL database using **JDBC**.

---

## 📄 insert.java (Servlet)

```java
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/insert")
public class insert extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String empname = request.getParameter("empname");
        String mobileno = request.getParameter("mobileno");

        try {
            // STEP 1: Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // STEP 2: Create Connection
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/emp",
                    "username",
                    "password"
            );

            // STEP 3: Prepare SQL Query
            PreparedStatement ps = conn.prepareStatement(
                    "INSERT INTO employee(empname, mobileno) VALUES (?, ?)"
            );

            ps.setString(1, empname);
            ps.setString(2, mobileno);

            // STEP 4: Execute Query
            int result = ps.executeUpdate();

            if (result > 0) {
                out.println("<h2>Employee Inserted Successfully!</h2>");
            } else {
                out.println("<h2>Insertion Failed!</h2>");
            }

            // STEP 5: Close Resources
            ps.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
            out.println("<h2>Error : " + e.getMessage() + "</h2>");
        }
    }
}
