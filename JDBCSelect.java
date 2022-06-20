import java.sql.*;
import java.util.*;

public class JDBCSelect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = "'" + str + "'";
        String url = "jdbc:mysql://localhost/ri_db";
        String user = "test";
        String pass = "test123";
        try (Connection connection = DriverManager.getConnection(url, user, pass)) {
            try (Statement statement = connection.createStatement();) {
                String sql = "SELECT id,name FROM student WHERE dept=" + str + ";";
                ResultSet rs = statement.executeQuery(sql);
                while (rs.next()) {
                    System.out.println(rs.getString(1) + " " + rs.getString(2));
                }

            }
        } catch (SQLException e) {
            System.out.print(e);
        }
    }
}