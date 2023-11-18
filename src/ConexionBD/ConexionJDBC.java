
package ConexionBD;

//1.Incluir la libreria
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ConexionJDBC {
    

    public static void main(String[] args) {
        //3.Definir la cadena de conexión
        String usuario = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/timcobd";
        //4.Creación de objetos para establecer la conexión
        Connection conexion;//Permite establecer la conexion con la BD
        Statement statement;//Permite ejecutar sentencias SQL
        ResultSet rs;//Tiene la capacidad de recibir la respuesta desde la BD (Referencia de una tabla)
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//2.Instanciar o cargar el driver al proyecto - Bloque Try Catch para manejar las excepciones
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            conexion = DriverManager.getConnection(url,usuario,password);//5.Establecer la conexión
            statement = conexion.createStatement();
            
            System.out.println("TABLA CONTACTO");
            System.out.println("ID CONTACTO | NOMBRE TRABAJADOR");
            statement.executeUpdate("INSERT INTO contacto (nombre_trabajador,ASUNTO) VALUES ('MAIRA','HERMANA')");
            rs = statement.executeQuery("SELECT * FROM contacto");
            rs.next();
            do {
                System.out.println(rs.getInt("idcontacto")+" : "+rs.getString("nombre_trabajador")+" : "+rs.getString("ASUNTO"));
            } while (rs.next());
            
            
            
        } catch (SQLException ex) { 
            System.out.println("NO SE CONECTO A LA BD");
            Logger.getLogger(ConexionJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
