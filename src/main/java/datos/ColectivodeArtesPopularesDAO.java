package datos;
import dominio.ColectivodeArtesPopulares;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
public class ColectivodeArtesPopularesDAO {
 Connection con;
Conexion cn=new Conexion();
PreparedStatement ps;
ResultSet rs;
   
  

public List listar(){
List<ColectivodeArtesPopulares> historia=new ArrayList();
String sql="select * from colectivodeartespopulares";
    try {
        con=cn.getConnection();
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
        while (rs.next()) {
            ColectivodeArtesPopulares p=new ColectivodeArtesPopulares();
            p.setId(rs.getInt(1));
            p.setCarusel(rs.getString(2));
            p.setHistoria(rs.getString(3));
            p.setImgHistoria(rs.getString(4));
            p.setMision(rs.getString(5));
            p.setVision(rs.getString(6));
            
            historia.add(p);
            
        }
    } catch (Exception e) {
    }
return historia;

}


public List listarImagen(){
List<ColectivodeArtesPopulares> historia=new ArrayList();
String sql="select carusel from colectivodeartespopulares  WHERE id=1";
    try {
        con=cn.getConnection();
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
        while (rs.next()) {
            ColectivodeArtesPopulares p=new ColectivodeArtesPopulares();
            p.setCarusel(rs.getString(1));
            historia.add(p);
            
        }
    } catch (Exception e) {
    }
return historia;

}


public List listarCarusel(){
List<ColectivodeArtesPopulares> historia=new ArrayList();
String sql="select carusel from colectivodeartespopulares WHERE id between 2 and 3;";
    try {
        con=cn.getConnection();
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
        while (rs.next()) {
            ColectivodeArtesPopulares p=new ColectivodeArtesPopulares();
            p.setCarusel(rs.getString(1));
            historia.add(p);
            
        }
    } catch (Exception e) {
    }
return historia;

}





public  int editar(ColectivodeArtesPopulares colectivodeArtesPopulares){
Connection conn=null;
PreparedStatement stmt=null;
int rows=0;
    try {
        conn=cn.getConnection();
        stmt=conn.prepareStatement("UPDATE colectivodeartespopulares SET historia=?,imgHistoria=?,Mision=?,Vision=? WHERE id=?");
        stmt.setString(1, colectivodeArtesPopulares.getHistoria());
        stmt.setString(2,colectivodeArtesPopulares.getImgHistoria());
        stmt.setString(3, colectivodeArtesPopulares.getMision());
        stmt.setString(4, colectivodeArtesPopulares.getVision());
        stmt.setInt(5, colectivodeArtesPopulares.getId());
      
         rows=stmt.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace(System.out);
}
        return rows;



}








 








}
