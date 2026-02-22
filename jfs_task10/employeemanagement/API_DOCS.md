# API Documentation

Base URL:
http://localhost:9090

---

## Create Employee

POST /employees

Body:
{
"employeeId": "101",
"name": "John",
"email": "john@gmail.com",
"location": "Chennai"
}

Response:
200 OK

---

## Fetch All Employees

GET /employees/displayAll

Response:
[
{
"employeeId": "101",
"name": "John",
"email": "john@gmail.com",
"location": "Chennai"
}
]

---

## Fetch Employee By ID

GET /employees/display/{employeeId}

Success:
200 OK

Not Found:
404 Not Found

---

## Update Employee

PUT /employees/update/{employeeId}

Body:
{
"employeeId": "101",
"name": "John Updated",
"email": "john_new@gmail.com",
"location": "Bangalore"
}

Response:
200 OK

---

## Delete Employee

DELETE /employees/delete/{employeeId}

Success:
200 OK

Not Found:
404 Not Found