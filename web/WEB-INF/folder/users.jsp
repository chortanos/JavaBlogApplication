<%-- 
    Document   : users
    Created on : 20.01.2015, 17:47:00
    Author     : Java
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table class="">
         <thead>
             <tr>
                <td>User Name</td>
             </tr>
        </thead>>
        <tbody>
              <c:forEach items="${listUser}" var="u">
            <tr>
                <td>${u.nameUser}</td>
                
            </tr>
            </c:forEach>
        </tbody>
          
        </table>
    </body>
</html>
