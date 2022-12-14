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
//@WebServlet(name = "ServletControladorIMGPR", urlPatterns = {"/ServletControladorIMGPR"})
//public class ServletControladorIMGPR extends HttpServlet {
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
//                     
//                     pdao.listarImgPr(response);
//                     
//    }
//    
//
//   
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//       
//    }
//
//}
