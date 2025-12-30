## INDEX.JSP

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

## NOW MAKE SERVLET FILE insert.java

