<htm>
<body>
<%
int a=Integer.parseInt(request.getParameter("t1"));
int b=Integer.parseInt(request.getParameter("t2"));
%>
<%= "Addition of Two number is "+add(a,b)%>
<%! 
int add(int m, int n){
return(m+n);
}
%>
</body>
</html>