package bank;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class BankSer3 extends HttpServlet
{
BankSessionBeanLocal brm = lookupBankSessionBeanLocal();
protected void processRequest(HttpServletRequest req, HttpServletResponse res)
throws ServletException, IOException, ClassNotFoundException, SQLException
{
long bal;
PrintWriter out=res.getWriter();
out.println("<html><head>");
long amount=Long.parseLong(req.getParameter("amount"));
HttpSession ses=req.getSession();
long acno=(long)ses.getAttribute("acc");
String tr=req.getParameter("tr");
if(tr.equals("dep"))
{
brm.deposit(acno, amount);
out.println("Transaction completed");
bal=brm.getBal(acno);
out.println("<br/><br/>Your balance is:"+bal);
}
else if(tr.equals("wid"))
{
if(brm.withdraw(acno, amount)==1){
out.println("Transaction completed");
bal=brm.getBal(acno);
out.println("<br/><br/>Your balance is:"+bal);
}
else
out.println("Low balance");
}
else if(tr.equals("tra"))
{
long toacc=Long.parseLong(req.getParameter("toAcc"));
long flag = brm.getBal(toacc);
if(flag != -1){
if(brm.withdraw(acno, amount)==1){
brm.deposit(toacc, amount);
out.println("Transaction completed");
bal=brm.getBal(acno);
out.println("<br/><br/>Your balance is:"+bal);
}
else
out.println("Low balance");
}
else
out.println("Account number is not correct");
}
else
{
out.println("</head>You haven't selected any option");
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
catch (ClassNotFoundException ex) {
Logger.getLogger(BankSer3.class.getName()).log(Level.SEVERE, null, ex);
}catch (SQLException ex) {
Logger.getLogger(BankSer3.class.getName()).log(Level.SEVERE, null, ex);
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
catch (ClassNotFoundException ex) {
Logger.getLogger(BankSer3.class.getName()).log(Level.SEVERE, null, ex);
}catch (SQLException ex) {
Logger.getLogger(BankSer3.class.getName()).log(Level.SEVERE, null, ex);
}
}
@Override
public String getServletInfo() {
return "Short description";
}
private BankSessionBeanLocal lookupBankSessionBeanLocal()
{
try {
Context c = new InitialContext();
return (BankSessionBeanLocal) c.lookup("java:global/Bank/Bank-ejb/BankSessionBean!bank.BankSessionBeanLocal");
}catch (NamingException ne) {
Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
throw new RuntimeException(ne);
}
}
}
