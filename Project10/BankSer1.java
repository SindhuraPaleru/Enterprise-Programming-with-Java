package bank;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class BankSer1 extends HttpServlet
{
BankSessionBeanLocal bsb = lookupBankSessionBeanLocal();protected void processRequest(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException, ClassNotFoundException, SQLException
{
response.setContentType("text/html;charset=UTF-8");
PrintWriter out = response.getWriter();
HttpSession ses = request.getSession();
String s1=request.getParameter("user");
String s2=request.getParameter("pwd");
int flag = bsb.validate(s1, s2);
long acc = bsb.getAcc();
if(flag==1)
{
ses.setAttribute("acc", acc);
ServletContext sc=request.getServletContext();
RequestDispatcher rd=sc.getRequestDispatcher("/BankJsp.jsp");
rd.forward(request,response);
}
else
{
ServletContext sc=request.getServletContext();
RequestDispatcher rd=sc.getRequestDispatcher("/Login.html");
rd.forward(request,response);
}
}
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException
{
try
{
processRequest(request, response);
}
catch (ClassNotFoundException ex)
{
Logger.getLogger(BankSer1.class.getName()).log(Level.SEVERE, null, ex);
}
catch (SQLException ex)
{
Logger.getLogger(BankSer1.class.getName()).log(Level.SEVERE, null, ex);
}
}
@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException
{
try
{
processRequest(request, response);
}
catch (ClassNotFoundException ex)
{
Logger.getLogger(BankSer1.class.getName()).log(Level.SEVERE, null, ex);
}
catch (SQLException ex)
{
Logger.getLogger(BankSer1.class.getName()).log(Level.SEVERE, null, ex);
}
}
@Override
public String getServletInfo()
{
return "Short description";
}
private BankSessionBeanLocal lookupBankSessionBeanLocal()
{
try
{
Context c = new InitialContext(); return(BankSessionBeanLocal)c.lookup("java:global/Bank/Bankejb/BankSessionBean!bank.BankSessionBeanLocal");
}
catch (NamingException ne)
{
Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
throw new RuntimeException(ne);
}
}
}
