<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Student Details Form</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-8">

            <div class="card shadow-lg border-0 rounded-4">
                <div class="card-header bg-primary text-white text-center rounded-top-4">
                    <h4>Student Details Form JSP</h4>
                </div>

                <div class="card-body p-4">

                    <form action="Hello" method="get">
                        <!-- Full Name -->
                        <div class="mb-3">
                            <label class="form-label">Full Name</label>
                            <input type="text"  name="sname" class="form-control" placeholder="Enter full name">
                        </div>

                        <!-- Email -->
                        <div class="mb-3">
                            <label class="form-label">Email Address</label>
                            <input type="email" name="semail" class="form-control" placeholder="Enter email">
                        </div>

                        <!-- Phone -->
                        <div class="mb-3">
                            <label class="form-label">Phone Number</label>
                            <input type="tel" name="sphone" class="form-control" placeholder="Enter phone number">
                        </div>

                      <!-- Gender -->
						<div class="mb-3">
						    <label class="form-label d-block">Gender</label>
						
						    <div class="form-check form-check-inline">
						        <input class="form-check-input" type="radio" name="sgen" id="genderMale" value="Male">
						        <label class="form-check-label" for="genderMale">Male</label>
						    </div>
						
						    <div class="form-check form-check-inline">
						        <input class="form-check-input" type="radio" name="sgen" id="genderFemale" value="Female">
						        <label class="form-check-label" for="genderFemale">Female</label>
						    </div>
						</div>


                        <!-- Course -->
                        <div class="mb-3">
                            <label class="form-label">Course</label>
                            <select class="form-select" name="scourse">
                                <option selected>Select course</option>
                                <option>Computer Science</option>
                                <option>Information Technology</option>
                                <option>Electronics</option>
                                <option>Mechanical</option>
                            </select>
                        </div>

                        <!-- Address -->
                        <div class="mb-3">
                            <label class="form-label">Address</label>
                            <textarea class="form-control" rows="3" placeholder="Enter address" name="saddress"></textarea>
                        </div>

                        <!-- Buttons -->
                        <div class="d-grid gap-2">
                            <button type="submit"  value="submit" name="b1" class="btn btn-primary">Submit</button>
                            <button type="reset" class="btn btn-outline-secondary">Reset</button>
                        </div>
                    </form>

                </div>
            </div>

        </div>
    </div>
</div>

</body>
</html>
