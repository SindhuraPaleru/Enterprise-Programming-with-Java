package bank;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Register extends HttpServlet
{BankSessionBeanLocal bsb = lookupBankSessionBeanLocal();
protected void processRequest(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException
{
long id=Long.parseLong(request.getParameter("id"));
String name = request.getParameter("name");
String pass = request.getParameter("pass");
long accno = Long.parseLong(request.getParameter("acc"));
long balance = Long.parseLong(request.getParameter("bal"));
response.setContentType("text/html;charset=UTF-8");
PrintWriter out = response.getWriter();
bsb.add(id,accno, name, pass, balance);
out.println("Account added successfully!!!");
}
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException
{
processRequest(request, response);
}
@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException
{
processRequest(request, response);
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
catch(NamingException ne)
{
Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
throw new RuntimeException(ne);}}}
