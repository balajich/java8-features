package exam;

import java.sql.*;

public class MyFirstDatabaseConnection {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:derby:zoo";
        try (Connection conn = DriverManager.getConnection(url);
             PreparedStatement ps = conn
                        .prepareStatement("jdbc:mysql://127.0.0.1:3306/zoo");
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                System.out.println(rs.getString(1));
            }
        }
    }
}