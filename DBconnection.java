
 
package loginapp;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
    public static Connection getConnection() {
        Connection conn = null;
        try {
            // Change database name, username, password as needed
            String url = "jdbc:mysql://localhost:3306/login_db";
            String user = "root";
            String pass = ""; // If you have XAMPP, password is usually blank
            conn = DriverManager.getConnection(url, user, pass);
        } catch (SQLException ex) {
            System.out.println("Database Error: " + ex.getMessage());
        }
        return conn;
    }
}
