import jakarta.servlet.http.*;  
import jakarta.servlet.*;  
import java.io.*;
public class LoginServlet extends HttpServlet{  
public void doPost(HttpServletRequest req,HttpServletResponse res)  
throws ServletException,IOException  
{
res.setContentType("text/html");//setting the content type  
PrintWriter pw=res.getWriter();//get the stream to write the data  
pw.println("<html><body>");
String uname=req.getParameter("t1");
String pass=req.getParameter("t2");
if(uname.equals("Yogesh")&&pass.equals("yogesh"))
{
pw.println("Welcome to Login Servlet");
pw.println("Login Successful"+uname);
}
else
{
pw.println("Invalid Login");
}
pw.println("</html></body>");
pw.close();
}
}