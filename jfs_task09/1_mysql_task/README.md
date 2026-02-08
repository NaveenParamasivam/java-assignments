# Java Full Stack - Task 09
## MySQL + JDBC Assignment


---
# 🗄️ MYSQL TASK

---
## Complete Query
👉 [MySQL Queries](./sql_queries.sql)

---
## ✅ Table Creation

### Query
```sql
CREATE TABLE Empl (
    empno INT PRIMARY KEY,
    ename VARCHAR(50) NOT NULL,
    job VARCHAR(50) NOT NULL,
    mgr INT NULL,
    hiredate DATE NOT NULL,
    sal DECIMAL(10,2) NOT NULL,
    comm DECIMAL(10,2) NULL,
    deptno INT NOT NULL
);

```
### Output
![Q1 Output](output_screenshots/table_creation.png)

---

## ✅ Value Insertion

### Query
```sql
INSERT INTO Empl VALUES
                     (8369, 'SMITH', 'CLERK', 8902, '1990-12-18', 800.00, NULL, 20),
                     (8499, 'ANYA', 'SALESMAN', 8698, '1991-02-20', 1600.00, 300.00, 30),
                     (8521, 'SETH', 'SALESMAN', 8698, '1991-02-22', 1250.00, 500.00, 30),
                     (8566, 'MAHADEVAN', 'MANAGER', 8839, '1991-04-02', 2985.00, NULL, 20),
                     (8654, 'MOMIN', 'SALESMAN', 8698, '1991-09-28', 1250.00, 1400.00, 30),
                     (8698, 'BINA', 'MANAGER', 8839, '1991-05-01', 2850.00, NULL, 30),
                     (8882, 'SHIVANSH', 'MANAGER', 8839, '1991-06-09', 2450.00, NULL, 10),
                     (8888, 'SCOTT', 'ANALYST', 8566, '1992-12-09', 3000.00, NULL, 20),
                     (8839, 'AMIR', 'PRESIDENT', NULL, '1991-11-18', 5000.00, NULL, 10),
                     (8844, 'KULDEEP', 'SALESMAN', 8698, '1991-09-08', 1500.00, 0.00, 30);

```

```sql
select * from empl;
```
### Output
![Q1 Output](output_screenshots/value_insertion.png)

---
## 🧾 Query Solutions

---
### Question 1A

ENAME AND SAL WHERE SAL >= 2200

### Query

```sql
SELECT ename, sal
FROM Empl
WHERE sal >= 2200;

```
### Output
![Q1A Output](output_screenshots/1A_solution.png)

---
### Question 1B

EMPLOYEES NOT GETTING COMMISSION

### Query

```sql
SELECT *
FROM Empl
WHERE comm IS NULL;
```
### Output
![Q1B Output](output_screenshots/1B_solution.png)

---
### Question 1C

SALARY NOT BETWEEN 2500 AND 4000

### Query

```sql
SELECT ename, sal
FROM Empl
WHERE sal NOT BETWEEN 2500 AND 4000;
```
### Output
![Q1C Output](output_screenshots/1C_solution.png)

---
### Question 1D

EMPLOYEES WITHOUT MANAGER

### Query

```sql
SELECT ename, job, sal
FROM Empl
WHERE mgr IS NULL;
```
### Output
![Q1D Output](output_screenshots/1D_solution.png)

---
### Question 1E

EMPLOYEE NAME HAVING 'A' AS THIRD LETTER

### Query

```sql
SELECT ename
FROM Empl
WHERE ename LIKE '__A%';
```
### Output
![Q1E Output](output_screenshots/1E_solution.png)

---
### Question 1F

EMPLOYEE NAME ENDING WITH 'T'

### Query

```sql
SELECT ename
FROM Empl
WHERE ename LIKE '%T';
```
### Output
![Q1F Output](output_screenshots/1F_solution.png)

---
# ☕ JDBC TASK

## ✅ JDBC Table Creation + Data Insert + Display

### Code 
👉 [JDBC code](./jdbc/src/main/java/EmployeeJDBCProgram.java)
```java
import java.sql.*;

public class EmployeeJDBCProgram {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/company";
        String user = "root";
        String password = "demopass";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {

            // 1️⃣ Create Table
            String createTable = "CREATE TABLE IF NOT EXISTS employee_jdbc (" +
                    "empcode INT PRIMARY KEY, " +
                    "empname VARCHAR(50), " +
                    "empage INT, " +
                    "esalary DOUBLE" +
                    ")";
            stmt.executeUpdate(createTable);
            System.out.println("Table Ready!");

            // 2️⃣ Insert Data (PreparedStatement)
            String insertSQL = "INSERT INTO employee_jdbc VALUES (?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(insertSQL);

            // Row 1
            ps.setInt(1, 101);
            ps.setString(2, "Jenny");
            ps.setInt(3, 25);
            ps.setDouble(4, 10000);
            ps.executeUpdate();

            // Row 2
            ps.setInt(1, 102);
            ps.setString(2, "Jacky");
            ps.setInt(3, 30);
            ps.setDouble(4, 20000);
            ps.executeUpdate();

            // Row 3
            ps.setInt(1, 103);
            ps.setString(2, "Joe");
            ps.setInt(3, 20);
            ps.setDouble(4, 40000);
            ps.executeUpdate();

            // Row 4
            ps.setInt(1, 104);
            ps.setString(2, "John");
            ps.setInt(3, 40);
            ps.setDouble(4, 80000);
            ps.executeUpdate();

            // Row 5
            ps.setInt(1, 105);
            ps.setString(2, "Shameer");
            ps.setInt(3, 25);
            ps.setDouble(4, 90000);
            ps.executeUpdate();

            System.out.println("Data Inserted!");

            // 3️⃣ Display Table Content
            String selectSQL = "SELECT * FROM employee_jdbc";
            ResultSet rs = stmt.executeQuery(selectSQL);

            System.out.println("\nEmployee Table Data:");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("empcode") + " " +
                                rs.getString("empname") + " " +
                                rs.getInt("empage") + " " +
                                rs.getDouble("esalary")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


```
### Output
![Q2 Output](output_screenshots/2_JDBC_solution.png)

---