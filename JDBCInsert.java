import java.util.*;
import java.sql.*;

public class JDBCInsert {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String url = "jdbc:mysql://localhost/ri_db";
        String username = "test";
        String password = "test123";

        while (n > 0) {
            Integer id = sc.nextInt();
            String name = "'" + sc.next() + "'";
            String dept = "'" + sc.next() + "'";
            String address = "'" + sc.next() + "'";
            Double gpa = sc.nextDouble();
            String sql1 = id + "," + name + "," + dept + "," + address + "," + gpa;
            String sql = "INSERT INTO BILL (SID,SNAME,DNAME,ADDRESS,GPA) VALUES(" + sql1 + ");";
            try (Connection con = DriverManager.getConnection(url, username, password);
                    Statement stmt = con.createStatement()) {
                stmt.executeUpdate(sql);
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
        String newdept = "'" + sc.next() + "'";
        try (Connection con = DriverManager.getConnection(url, username, password);
                Statement stmt = con.createStatement()) {
            stmt.execute("SELECT * FROM BILL WHERE DNAME=" + newdept);
        } catch (Exception e) {
            System.out.println("No students in" + newdept + " department");
        }
    }
}