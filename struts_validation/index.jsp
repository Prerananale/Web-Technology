<%@ page language = "java" contentType = "text/html; charset = ISO-8859-1"
   pageEncoding = "ISO-8859-1"%>
<%@ taglib prefix = "s" uri = "/struts-tags"%>
   <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">

<html>
   <head>
      <title>Hello World</title>
   </head>
   
   <body>
      <h2>Registration </h2>
        <form action="register">
            Userame: <input type="text" name="username"/></br>
            Password: <input type="password" name="password"/></br>
            Confirm Password: <input type="password" name="confirmPassword"/></br>
            Email Address: <input type="text" name="email"/></br>
            Mobile Number: <input type="text" name="mobile"/></br>
            <p/>
            <input type="submit" value="Register"/>
            <p/>
            <s:actionerror/>     
        <form>
   </body>
</html>