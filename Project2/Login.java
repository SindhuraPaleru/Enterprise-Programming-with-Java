Login.java:
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aaa;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author cse3107
 */
@WebServlet(name = "login", urlPatterns = {"/login"})
public class login extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        ServletContext sc=getServletContext();
        RequestDispatcher rd;
        String s1=request.getParameter("uname");
        String s2=request.getParameter("psw");
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection       con=DriverManager.getConnection("jdbc:derby://localhost:1527/login","cse3107",
       "app");
        Statement st=con.createStatement();
         ResultSet rs=st.executeQuery("select * from logindata where username='"+s1+"'");
        response.setContentType("text/html;charset=UTF-8");
        while(rs.next()){
            try (PrintWriter out = response.getWriter()) {
                /* TODO output your page here. You may use following sample code. */
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet login</title>");            
                out.println("</head>");
                out.println("<body>");
                if(s2.equals(rs.getString("password")))
                {
                    out.println("login successfull<br>");
                    rd=sc.getRequestDispatcher("/home");
                    rd.include(request, response);
                }
                else
                {
                    out.println("login failed<br>");
                    rd=sc.getRequestDispatcher("/index.html");
                    rd.include(request, response);
                }
                out.println("</body>");
                out.println("</html>");
            }
        }
    }
}
