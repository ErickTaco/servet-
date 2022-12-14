package web;
import datos.ColectivodeArtesPopularesDAO;
import datos.PruebaDAO;
import dominio.ColectivodeArtesPopulares;
import dominio.prueba;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
@MultipartConfig 
@WebServlet(name = "ServletControlador", urlPatterns = {"/ServletControlador"})
public class ServletControlador extends HttpServlet {
private PruebaDAO prueba=new PruebaDAO();
private String pathFiles="C:\\Users\\janet\\Documents\\NetBeansProjects\\LaChanga\\src\\main\\webapp\\img\\";
private File uploads=new File(pathFiles);
private String[] extens={".ico",".jpg",".png",".jpeg"};
@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     String accion = request.getParameter("accion");
            if (accion != null) {
            switch (accion) {
                
              
                default:
                    this.mostrarInformacion(request, response);
            }
        } else {
            this.mostrarInformacion(request, response);
           
        }
    }    

    
    
    
   
    
private void mostrarInformacion(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        List<ColectivodeArtesPopulares> historia;
        List<ColectivodeArtesPopulares> imagenPr;
        List<ColectivodeArtesPopulares> imagenesCarusel;
        historia = new ColectivodeArtesPopularesDAO().listar();
        imagenPr=new ColectivodeArtesPopularesDAO().listarImagen();
        imagenesCarusel=new ColectivodeArtesPopularesDAO().listarCarusel();
        response.sendRedirect("changa.jsp");
        HttpSession sesion = request.getSession();
        sesion.setAttribute("historia", historia);
        sesion.setAttribute("imagenPr", imagenPr);
        sesion.setAttribute("imagenesCarusel", imagenesCarusel);
}

@Override
 protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
 
        //creamos una variable para guardar la ccion
String accion=request.getParameter("accion");
    //evaluamos si la accion esta vacia 
if (accion != null) {
            switch (accion) {
                
                case "Editar":
                   this.actualizar(request, response);
                   this.mostrarInformacion(request, response);
                    break;
                    
                case "insertar":
                this.guardar(request, response);
                break;
                
            }
        }


}
private void actualizar(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

 try {
        String historia =request.getParameter("txtHistoria");
        Part part =request.getPart("fotoHis");
        String mision =request.getParameter("txtMision");
String vision =request.getParameter("txtVision");
int id =1;
         
         String nombreArc;
        
        if (part==null) {
            System.out.println("web.ServletControlador.guardar()");
            return;
        }
        if (isExttension(part.getSubmittedFileName(), extens)) {
            String photo= guadarArch(part, uploads);
            ColectivodeArtesPopulares col=new ColectivodeArtesPopulares(historia,part.getSubmittedFileName(), mision, vision,id);
            int registrosModificados=new ColectivodeArtesPopularesDAO().editar(col);


        }
    } catch (Exception e) {
        
    }
//int registrosModificados=new ColectivodeArtesPopularesDAO().editar(col);



}



private void guardar (HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        
    
    try {
        String name =request.getParameter("name");
        Part part =request.getPart("file");
 
         
         String nombreArc;
        
        if (part==null) {
            System.out.println("web.ServletControlador.guardar()");
            return;
        }
        if (isExttension(part.getSubmittedFileName(), extens)) {
            String photo= guadarArch(part, uploads);
            prueba prueb=new prueba(name,photo,part.getSubmittedFileName());
            int registrosModificados=new PruebaDAO().editar(prueb);
this.mostrarInformacion(request, response);

        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    
    
    
    
    
    
    
    
}




private String guadarArch( Part part , File pathUploads){
    
    String pathAbolute="";
    
    
    try {
       Path path=Paths.get(part.getSubmittedFileName());
       String nombreArchivo =path.getFileName().toString();
       InputStream input = part.getInputStream();
       
        if (input !=null) {
            File file=new File(pathUploads,nombreArchivo);
            pathAbolute=file.getAbsolutePath();
            Files.copy(input, file.toPath());
        }
       
    } catch (Exception e) {
    }
 
    return pathAbolute;
}
private boolean isExttension(String nombreArc,String[] extensiones){
    for (String et:extensiones) {
        if (nombreArc.toLowerCase().endsWith(et)) {
            return true;
        }
    }
    return false;
}


}
