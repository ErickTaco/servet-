package datos;

import dominio.ColectivodeArtesPopulares;
import java.sql.ResultSet;
import dominio.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class loginDAO {
int resp=0;
Connection con;
Conexion cn=new Conexion();
PreparedStatement ps;
ResultSet rs;
public  int validarLogin(Login tm){
    
String sql="Select count(id) as cantidad from `integrantes` where nombre='"+tm.getNombre()+"' and contr='"+tm.getClave()+"'";
 try {
        con=cn.getConnection();
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
        while (rs.next()) {
            resp=rs.getInt("cantidad");
            
        }
    } catch (Exception e) {
    }

return resp;
}


}
