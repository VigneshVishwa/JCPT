import java.util.*;
import java.sql.*;

public class JDBCDelete {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // Class.forName("")
        String str = sc.next();
        str = "'" + str + "'";
        // System.out.println(str);
        final String url = "jdbc:mysql://localhost/ri_db";
        final String username = "test";
        final String password = "test123";
        try (Connection connection = DriverManager.getConnection(url, username, password);
                Statement statement = connection.createStatement();) {
            String sql = "DELETE FROM book WHERE name =" + str;
            statement.executeUpdate(sql);
            ResultSet rs = statement.executeQuery("SELECT Id, name, author FROM book;");
            while (rs.next()) {
                System.out.print(rs.getString(1));
                System.out.print(rs.getString(2));
                System.out.print(rs.getString(3));
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}