package cine;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static final String url = "jdbc:mysql://localhost:3307/cine_marcosmartin";
    private static final String usuario = "root";
    private static final String contraseña = "";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, usuario, contraseña);
    }
}
