<%-- 
    Document   : paginaResultado
    Created on : 1 nov. 2020, 19:07:09
    Author     : desa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PA2</title>
    </head>
    <body>
        <%
            //Yo puedo escribir codigo java
            String nombrePersona=(String)request.getAttribute("nombrePersonaAtributo");            
            out.print("<h1>"+nombrePersona+"</h1>");
        %>
        <h1>Finalizado</h1>
        <h2><%=nombrePersona%></h2>
        <h2><%=(2+2)%></h2>
    </body>
</html>
