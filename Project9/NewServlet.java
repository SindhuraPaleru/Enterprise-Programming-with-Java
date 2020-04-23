package com;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name = "NewServlet", urlPatterns = {"/NewServlet"})
public class NewServlet extends HttpServlet {
@EJB
private NewSessionBeanLocal newSessionBean;
protected void processRequest(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException, InterruptedException, ExecutionException
{
response.setContentType("text/html;charset=UTF-8");
Long upper = Long.parseLong(request.getParameter("upp"));
int time = Integer.parseInt(request.getParameter("tim"));
PrintWriter out = response.getWriter();
Future obj = newSessionBean.calculateMaxPrimeBelow(upper);
newSessionBean.init(obj,time);
if(obj.get()!=null)
out.println("<h1>" + obj.get() + "</h1>");
else
out.println("<h1>Method call cancelled</h1>");
}
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException
{
try {
processRequest(request, response);
} catch (InterruptedException | ExecutionException ex) {
Logger.getLogger(NewServlet.class.getName()).log(Level.SEVERE, null, ex);
}
}
@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException
{
try {
processRequest(request, response);
} catch (InterruptedException | ExecutionException ex) {
Logger.getLogger(NewServlet.class.getName()).log(Level.SEVERE, null, ex);
}
}
}
