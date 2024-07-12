import jakarta.servlet.http.*;  
import jakarta.servlet.*;  
import java.io.*; 
public class SecondServlet extends HttpServlet{  
public void doGet(HttpServletRequest req,HttpServletResponse res)  
throws ServletException,IOException  
{  
res.setContentType("text/html");//setting the content type  
PrintWriter out=res.getWriter();//get the stream to write the data  
Cookie ck[]=req.getCookies();
out.println("Hello "+ck[0].getValue());
out.close();
}}