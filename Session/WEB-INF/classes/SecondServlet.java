import jakarta.servlet.http.*;  
import jakarta.servlet.*;  
import java.io.*; 
public class SecondServlet extends HttpServlet{  
public void doGet(HttpServletRequest req,HttpServletResponse res)  
throws ServletException,IOException  
{  
res.setContentType("text/html");//setting the content type  
PrintWriter out=res.getWriter();//get the stream to write the data  
HttpSession ses=req.getSession(false);
String n=(String)ses.getAttribute("username");
out.println("Username is:"+n);
out.close();
}}