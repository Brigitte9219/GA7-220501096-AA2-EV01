package ConexionBD;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionJDBC {

    public static void main(String[] args) {
        try {
            // Crea una conexión
            Connection conexion = obtenerConexion();

            // Ejemplo de CRUD
            // 1. Crear (Insertar)
            registrarTrabajador(conexion, "Pedro", "Bienvenida");

            // 2. Leer (Seleccionar)
            mostrarTrabajadores(conexion);

            // 3. Actualizar
            actualizarTrabajador(conexion, 13, "Damaris", "Holaaaa");

            // 4. Leer después de la actualización
            mostrarTrabajadores(conexion);

            // 5. Eliminar
            eliminarTrabajador(conexion, 12);

            // 6. Leer después de la eliminación
            mostrarTrabajadores(conexion);

            // Cierra la conexión
            conexion.close();
        } catch (SQLException ex) {
            System.out.println("Error al ejecutar la operación CRUD.");
            Logger.getLogger(ConexionJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Método para obtener una conexión
    private static Connection obtenerConexion() throws SQLException {
        String usuario = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/timcobd3";
        return DriverManager.getConnection(url, usuario, password);
    }

    // Método para insertar un registro
    private static void registrarTrabajador(Connection conexion, String nombreTrabajador, String asunto) throws SQLException {
        try (Statement statement = conexion.createStatement()) {
            statement.executeUpdate("INSERT INTO contacto (nombre_trabajador, ASUNTO) VALUES ('" + nombreTrabajador + "', '" + asunto + "')");
            System.out.println("Registro insertado correctamente.");
        }
    }

    // Método para mostrar todos los registros
    private static void mostrarTrabajadores(Connection conexion) throws SQLException {
        try (Statement statement = conexion.createStatement();
             ResultSet rs = statement.executeQuery("SELECT * FROM contacto")) {
            while (rs.next()) {
                System.out.println(rs.getInt("idcontacto") + " : " + rs.getString("nombre_trabajador") + " : " + rs.getString("ASUNTO"));
            }
        }
    }

    // Método para actualizar un registro
    private static void actualizarTrabajador(Connection conexion, int id, String nuevoNombre, String nuevoAsunto) throws SQLException {
        try (Statement statement = conexion.createStatement()) {
            statement.executeUpdate("UPDATE contacto SET nombre_trabajador = '" + nuevoNombre + "', ASUNTO = '" + nuevoAsunto + "' WHERE idcontacto = " + id);
            System.out.println("Registro actualizado correctamente.");
        }
    }

    // Método para eliminar un registro
    private static void eliminarTrabajador(Connection conexion, int id) throws SQLException {
        try (Statement statement = conexion.createStatement()) {
            statement.executeUpdate("DELETE FROM contacto WHERE idcontacto = " + id);
            System.out.println("Registro eliminado correctamente.");
        }
    }
}