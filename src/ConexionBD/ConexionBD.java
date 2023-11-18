
package ConexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    
    private static Connection conexion = null;

    public static Connection obtenerConexion() {
        try {
            if (conexion == null || conexion.isClosed()) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/timcobd";
                String usuario = "root";
                String contraseña = "";
                conexion = DriverManager.getConnection(url, usuario, contraseña);
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("PROBLEMA AL CONECTAR CON LA BD");
            e.printStackTrace();
        }
        return conexion;
    }

    public static void cerrarConexion() {
        if (conexion != null) {
            try {
                conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}