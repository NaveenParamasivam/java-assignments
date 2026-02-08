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

