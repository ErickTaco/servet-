
package datos;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    
   Connection con;
    String url="jdbc:mysql://localhost:3306/lachanga?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    String user="root";
    String contrasenia="";
    
    
    public Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,user,contrasenia);
        } catch (Exception e) {
        }
    return con;
    }
            
}

