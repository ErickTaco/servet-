<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="modal fade" id="agregarProductoModalCarusel">
            <div class="modal-dialog modal-lg">
                <div class="modal-content">
                    <div class="modal-header text-black" style="background-color: #00659B;">
                        <h5 class="modal-tittle" style="color: white">Factura</h5>
                       
                    </div>

                    <form  method="POST" class="was-validated" enctype="multipart/form-data">
                        <div class="modal-body">


                  
                                                           

                            <div class="form-group">
                                 <div class="col-md-6">
                        <img src="ServletControladorImgHi" class="img-fluid" alt="imgencenttro"> 
                        <input type="file" class="form-control" name="fotoHis" >
                    </div>
                            </div>


                    

                                                        <div class="modal-footer">
                                <button class="btn btn-success" type="submit">Guardar</button>
                            </div>
                                        
               
                        </div>
                    </form>
                </div>
            </div>
        </div>