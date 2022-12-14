package web;

import datos.ColectivodeArtesPopularesDAO;
import datos.loginDAO;
import dominio.ColectivodeArtesPopulares;
import dominio.Login;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "login", urlPatterns = {"/login"})
public class login extends HttpServlet {
    
       
    @Override
protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
String accion=request.getParameter("accion");
    //evaluamos si la accion esta vacia 
if (accion != null) {
            switch (accion) {
                case "iniciar":
             this.login(request, response);
                    break;
               
                   
            }
        }
}





private void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

 Login tm=new Login();
            loginDAO lg=new loginDAO();
            int rspta=0;
            if(request.getParameter("btn-login")!=null){
            String usuario=request.getParameter("txtusuario");
            String clave=request.getParameter("txtclave");
            tm.setNombre(usuario);
            tm.setClave(clave);
                try {
                    rspta=lg.validarLogin(tm);
                } catch (Exception ex) {
                    Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
                }
              if(rspta!=0){
                  this.mostrarInformacion(request, response);
                    
              }else{
                  response.sendRedirect("login.jsp?rspta="+rspta);
              }
}



}


private void mostrarInformacion(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        List<ColectivodeArtesPopulares> historia;
        historia = new ColectivodeArtesPopularesDAO().listar();
        
        response.sendRedirect("administracion.jsp");
        HttpSession sesion = request.getSession();
        sesion.setAttribute("historia", historia);
        
}


 


    
}
