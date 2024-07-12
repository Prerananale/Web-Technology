import java.io.*;
import jakarta.servlet.*;
public class First implements Servlet{
ServletConfig config=null;
public void init(ServletConfig config){
this.config=config;
System.out.println("servlet is initialized");
}
public void service(ServletRequest req,ServletResponse res)
throws IOException,ServletException{
res.setContentType("text/html");
PrintWriter out=res.getWriter();
String uname=req.getParameter("t1");
String pass=req.getParameter("t2");
out.print("<html><body>");
out.print("<b>Welcome to Servlet Interface</b></br>");
out.println("<b> Username is"+uname+"</b></br>");
out.println("<b> Password is"+pass+"</b>");
out.print("</body></html>");
}
public void destroy(){System.out.println("servlet is destroyed");}
public ServletConfig getServletConfig(){return null;}
public String getServletInfo(){return null;}
}