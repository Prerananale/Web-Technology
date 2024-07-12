<html>
<body>
<%
String name=request.getParameter("t1");
String mobile=request.getParameter("t2");
String email=request.getParameter("t3");
String address=request.getParameter("t4");
out.println("Welcome "+name+"</br>");
out.println("Mobile Number: "+mobile+"</br>");
out.println("Email ID: "+email+"</br>");
out.println("Address: "+address+"</br>");
%>
</body>
</html>