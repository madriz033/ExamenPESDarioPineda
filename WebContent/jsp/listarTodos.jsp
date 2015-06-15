<%@page import="es.curso.model.Entity.Tarjeta"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!--  header.jsp -->
<%@ include file="../template/header.jsp" %>

    <h1><%= request.getAttribute("titulo") %></h1>
   <!-- tabla html, dinamica -->
   
   <span><%=LocalDateTime.now() %></span>
   
   <% ArrayList<Tarjeta> tarjetas = (ArrayList<Tarjeta>)request.getAttribute("tarjetas");%>
   
   
   <table>
      <tr>
         <th>ID</th>
         <th>NUMERO TARJETA</th>
         <th>CUPO MAXIMO</th>
         <th>SALDO DISPONIBLE</th>         
         <th>TIPO</th>
         <th>NUMERO COMPROBACION</th>
         <th>CONTRASEÑA</th>
         <th>BLOQUEADA</th>        
       </tr>
        <%for(Tarjeta t: tarjetas){ %>  
          <form id ="formulario<%= t.getId()%>" action="#"  method="post" onsubmit="return false;">
          <tr id="<%= t.getId()%>">
             <td><input type="text" name="id" value ="<%= t.getId() %>" /></td>
             <td><input type="text" name="numero" value="<%= t.getNumero() %>"  /></td>           
             <td><input type="text" name="cupoMaximo" value="<%= t.getCupoMaximo() %>" /></td>
             <td><input type="text" name="saldoDisponible" value="<%= t.getSaldoDisponible() %>" /></td>
             <td><input type="text" name="tipo" value="<%= t.getTipo() %>" /></td>
             <td><input type="text" name="numComprobacion" value="<%= t.getNumComprobacion() %>" /></td>
             <td><input type="text" name="contrasenha" value="<%= t.getContrasenha() %>"/></td>
             <td><input type="text" name="bloqueada" value="<%= t.isBloqueada()==true ?"SI":"NO"%>"/></td>
             
               
            <!--  EDITAR REGISTROS 
               <td><input class="btnSinBordes" 
                   type="submit" value="Eliminar"
                     name="btn<%= t.getId()%>" onclick="enviar(this);"/> 
               </td>
               <td><input class="btnSinBordes" 
                   type="submit" value="Actualizar"
                     name="btn<%= t.getId()%>" onclick="enviar(this);"/> 
               </td>
             -->  
              
          </tr>
    	 </form>
    	 
     <% } %>
     
     
     
     
      <!--  las siguientes tr se construyen dinamicamente usando instrucciones java-->
   </table>
   
   <!--  footer.jsp -->
<%@ include file="../template/footer.jsp" %>