# STEP 1:- LOAD DRIVER
```bash
Class.for.Name("com.mysql.cj.jdbc.Driver")
```

# STEP 2 :-  CONNECTION ESTABLISH
```bash
Connection conn = DriverMannger.getConnection('jdbc://localhost:3306/emp')