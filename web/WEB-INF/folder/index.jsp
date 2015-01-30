<%-- 
    Document   : index
    Created on : 03.01.2015, 23:07:03
    Author     : Java
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       
        <title>JSP Page</title>
    </head>
    <body>
        <h1> </h1>
     <center>
    
    </center>
   
          
        </table>
        <style>
         .form-signin {
	max-width: 330px;
	padding: 15px;
	margin: 0 auto;
}
        </style>
      <form class="form-signin" role="form" action= method="POST">
	<h2 class="form-signin-heading">Please sign in</h2>
	<input type="text" name="j_username" class="form-control" placeholder="Name" required autofocus> 
	<input type="password" name="j_password" class="form-control" placeholder="Password" required> 
	<button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
</form>
      
    </body>
</html>
