# STEP 1:- LOAD DRIVER
```bash
Class.for.Name("com.mysql.cj.jdbc.Driver")
```

# STEP 2 :-  CONNECTION ESTABLISH
```bash
Connection conn = DriverMannger.getConnection('jdbc://localhost:3306/emp')
```

# STEP 3 :- SELECT , INSER , DELETE , UPDATE
```bash
PreparedStatement ps = conn.prepareStatement("select * from user ");
```

# STEP 4: - EXCUTE QUERY
```bash
ps.executeQuery(); // Select
ps.executeUpdate(); // Insert, Update , Delete

ResultSet rs = ps.executeQuery();
