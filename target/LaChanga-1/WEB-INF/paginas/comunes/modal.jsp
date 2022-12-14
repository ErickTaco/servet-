<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="modal fade" id="agregarProductoModal">
            <div class="modal-dialog modal-lg">
                <div class="modal-content">
                    <div class="modal-header text-black" style="background-color: #00659B;">
                        <h5 class="modal-tittle" style="color: white">Factura</h5>
                       
                    </div>

                    <form action="ServletControlador?accion=Editar" method="POST" class="was-validated" enctype="multipart/form-data">
                        <div class="modal-body">


                    <div class="container-fluid mt-1 me-1">
                        <div class="row" style=";justify-content: center"> 
                             <c:forEach var="historia" items="${historia}">
                                <div class="card m-5" style="width: 10rem;background: transparent;">
                                <img src="" class="img-fluid" alt="...">
                           
                                </div>  
                            </c:forEach>
                        </div>
                    </div>
                            
                                                           
    
                <label for="exampleFormControlTextarea4">Texto Historia</label>
                     
                <input type="text" required class="form-control" value="<c:forEach var="historia" items="${historia}">
                           ${historia.getHistoria()}</c:forEach>" name="txtHistoria" />

                        
         


                            <div class="form-group">
                                 <div class="col-md-6">
                                     <img src="img/<c:forEach var="historia" items="${historia}">${historia.getImgHistoria()}</c:forEach>" class="img-fluid" alt="imgencenttro"> 
                        <input type="file" class="form-control" name="fotoHis" >
                    </div>
                            </div>


                            <div class="form-group purple-border">
                <label for="exampleFormControlTextarea4">Texto Mision</label>
                    <input type="text" required class="form-control" value="<c:forEach var="historia" items="${historia}">
                           ${historia.getMision()}</c:forEach>" name="txtMision" />
             </div>


                                        
                <label for="exampleFormControlTextarea4">Texto Vision</label>
                    <input type="text" required class="form-control" value="<c:forEach var="historia" items="${historia}">
                           ${historia.getVision()}</c:forEach>" name="txtVision" />
             
                            
                            

                            <div class="modal-footer">
                                <button class="btn btn-success" type="submit">Guardar</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>