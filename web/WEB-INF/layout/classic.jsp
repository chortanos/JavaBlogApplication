<%-- 
    Document   : classic
    Created on : 04.01.2015, 14:55:54
    Author     : Java
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"  %> 


<!DOCTYPE html>
<html>
    <head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.0/jquery.min.js"></script>   
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css" rel="stylesheet">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css" rel="stylesheet">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
 <title><tiles:getAsString name="title"></tiles:getAsString></title>
    </head>

<body>
       <nav class="navbar navbar-default navbar-static-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
            <a class="navbar-brand" href="<spring:url value="/"></spring:url>">Java Blog Application</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav">
              <li class="active"><a href="<spring:url value="/" />">Home</a></li>
            <li><a href="#about">About</a></li>
            <li><a href="<spring:url value="/users.htm"></spring:url>">Users</a></li>
            <li><a href="#contact">Contact</a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>
 
       
        
        
        
        
        
    <tiles:insertAttribute name="body"></tiles:insertAttribute>
    <br><br>
    <center>
    <tiles:insertAttribute name="footer"></tiles:insertAttribute>
    </center>
  
    </body>

        
        
    
   
</html>
