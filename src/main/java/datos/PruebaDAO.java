package datos;

import dominio.ColectivodeArtesPopulares;
import dominio.prueba;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PruebaDAO { 
 Connection con;
Conexion cn=new Conexion();
PreparedStatement ps;
ResultSet rs;
   
 public  int editar(prueba Prueba){
Connection conn=null;
PreparedStatement stmt=null;
int rows=0;
    try {
        conn=cn.getConnection();
        stmt=conn.prepareStatement("INSERT INTO prueba VALUES (?,?,?)");
        stmt.setString(1, Prueba.getNombre());
         stmt.setString(2, Prueba.getImg()); 
        stmt.setString(3, Prueba.getNombreImg());
         rows=stmt.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace(System.out);
}
        return rows;



}
   
}
