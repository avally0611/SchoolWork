/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author aaminahv
 */
public class SqlManager {

    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/apollo";
    private static final String user = "root";
    private static final String pass = "Reddam2021";

    private static Connection conn;

    public static void connect() throws SQLException {
        if (conn == null) {
            conn = DriverManager.getConnection(url, user, pass);
        }
    }

    public static void update(String update) throws SQLException {
        PreparedStatement statement = conn.prepareStatement(update);
        statement.executeUpdate();
        statement.close();
    }

    public static ResultSet query(String query) throws SQLException {
        PreparedStatement statement = conn.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery();

        return resultSet;
    }
}
