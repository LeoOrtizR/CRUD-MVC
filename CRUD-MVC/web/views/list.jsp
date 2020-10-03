<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="Entity.Persona"%>
<%@page import="EntityDAO.PersonaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <h1>Personas</h1>
            <table border="1">
                <thead>
                    <tr>
                        <th>CODIGO</th>
                        <th>NOMBRE</th>
                        <th>DOCUMENTO</th>
                        <th>ACCIONES</th>
                    </tr>
                </thead>
                <%
                    PersonaDAO dao = new PersonaDAO();
                    List<Persona>list=dao.listar();
                    Iterator<Persona>iter=list.iterator();
                    Persona per = null;
                    while(iter.hasNext()){
                        per=iter.next();
                %>
                <tbody>
                    <tr>
                        <td><%= per.getCodigo() %></td>
                        <td><%= per.getNombre() %></td>
                        <td><%= per.getDocumento() %></td>
                        <td>
                            <a>Editar</a>
                            <a>Remover</a>
                        </td>
                    </tr>
                    <%}%>
                </tbody>
            </table>
        </div>
    </body>
</html>