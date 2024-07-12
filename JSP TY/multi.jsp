<html>
<body>
<%
int a=Integer.parseInt(request.getParameter("t1"));
int b=Integer.parseInt(request.getParameter("t2"));
out.println("Multiplication is "+(a*b));
%>
</body>
</html>