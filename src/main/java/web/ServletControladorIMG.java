//
//package web;
//
//
//
//import datos.ColectivodeArtesPopularesDAO;
//import dominio.ColectivodeArtesPopulares;
//import java.io.IOException;
//import java.io.PrintWriter;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
///**
// *
// * @author janet
// */
//@WebServlet(name = "ServletControladorIMG", urlPatterns = {"/ServletControladorIMG"})
//public class ServletControladorIMG extends HttpServlet {
//    ColectivodeArtesPopularesDAO pdao=new ColectivodeArtesPopularesDAO();
//    
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//       
//        }
//    
//
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//                     int id=Integer.parseInt(request.getParameter("id"));
//                      
//                    pdao.listarImg(id, response);
//                   
//                  
//     }
//
//   
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//       
//    }
//
//}
