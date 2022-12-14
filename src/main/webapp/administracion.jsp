<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <jsp:include page="WEB-INF/paginas/comunes/estilos.jsp"></jsp:include>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <table class="table" >
  <thead class="thead-dark">
    <tr>
        <th  colspan="2" scope="col" class="text-center">Configuracion De Nuestra Pagina
           <c:forEach var="historia" items="${usuario}">
                        ${usuario.getNombre()}
                    </c:forEach>
        </th>
      
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">pagina</th>
      <td><button type="button" class="btn btn-outline-success" data-toggle="modal" 
                  data-target="#agregarProductoModal" >Success</button></td>
                  
                  
                  
                  
    <jsp:include page="WEB-INF/paginas/comunes/modal.jsp"></jsp:include>
      
      
      
      
        
      
    </tr>
    
  </tbody>
</table>


<jsp:include page="WEB-INF/paginas/comunes/estilos.jsp"></jsp:include>   
    </body>
</html>
