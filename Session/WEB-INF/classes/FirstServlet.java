import jakarta.servlet.http.*;  
import jakarta.servlet.*;  
import java.io.*; 
public class FirstServlet extends HttpServlet{  
public void doGet(HttpServletRequest req,HttpServletResponse res)  
throws ServletException,IOException  
{  
res.setContentType("text/html");//setting the content type  
PrintWriter out=res.getWriter();//get the stream to write the data  
String name=req.getParameter("t1");
out.println("Username is:"+name);
HttpSession ses=req.getSession();
ses.setAttribute("username",name);
out.println("<a href='second'> Click</a>");
out.close();
}}