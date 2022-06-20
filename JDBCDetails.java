import java.sql.*;

public class JDBCDetails {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ri_db", "test", "test123");
            DatabaseMetaData dbmd = con.getMetaData();
            System.out.println("Driver name: " + dbmd.getDriverName());
            System.out.println("Driver Version: " + dbmd.getDriverVersion());
            String str = dbmd.getUserName();
            System.out.println("UserName: " + str);
            con.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ri_db", "test", "test123");
            DatabaseMetaData dbmd = con.getMetaData();
            System.out.println("Database Product Name: " + dbmd.getDatabaseProductName());
            System.out.println("Database Product Version: " + dbmd.getDatabaseProductVersion());
            con.close();
        } catch (SQLException e) {
            System.out.println(e);
        }

    }
}