# 📦 JDBC Database Connection Steps (MySQL)

This file describes **all required steps** to connect a Java application with a MySQL database using **JDBC**.

---

## 🔹 STEP 1: Load JDBC Driver

```java
Class.forName("com.mysql.cj.jdbc.Driver");
```

## 🔹 STEP 2: Establish Database Connection
```java
Connection conn = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/emp",
    "username",
    "password"
);
```

## 🔹 STEP 3: Create SQL Statement

(SELECT / INSERT / UPDATE / DELETE)

```java
PreparedStatement ps = conn.prepareStatement(
    "SELECT * FROM user"
);
```

## 🔹 STEP 4: Execute Query

```java
ResultSet rs = ps.executeQuery();

while (rs.next()) {
    // process result set
}
```

▶ INSERT / UPDATE / DELETE

```java
int rows = ps.executeUpdate();

```


## 🔹 STEP 5: Close Resources

```java
rs.close();
ps.close();
conn.close();
```