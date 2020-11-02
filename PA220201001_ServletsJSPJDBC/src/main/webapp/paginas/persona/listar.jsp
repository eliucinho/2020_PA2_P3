<%-- 
    Document   : listar
    Created on : 1 nov. 2020, 20:10:51
    Author     : desa
--%>

<%@page import="hn.uth.pa2.p2.app.controllers.PersonaListarController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Persona</title>
    </head>
    <body>
        <h1>Lista de Personas</h1>
        <%!PersonaListarController controlador=new PersonaListarController();%>
        <%=controlador.getTabla()%>
    </body>
</html>
