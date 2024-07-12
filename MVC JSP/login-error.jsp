<%@page import="com.javatpoint.LoginBean"%>  
  
<p>Error !!!! Invalid Password</p>  
<%  
LoginBean bean=(LoginBean)request.getAttribute("bean");  
out.print("Please change the password, "+bean.getName());  
%>  