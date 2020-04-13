import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*** * @author sindh */
@WebServlet(urlPatterns = {"/Login4"})
public class Login4 extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        int j=0;
        response.setContentType("text/html;charset=UTF-8");
        ServletContext sc=getServletContext();
        String user=request.getParameter("tbuser");
        String pwd=request.getParameter("tbpwd");
        String pwddb=null;
        RequestDispatcher rd;
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection con = DriverManager.getConnection( "jdbc:derby://localhost:1527/logindb", "sa","sqlserver");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select password from loginbean where uname='"+user+"'");
        while(rs.next())
        {
            pwddb=rs.getString("password");
            j=1;
        }
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Login4</title>");            
            out.println("</head>");
            out.println("<body>");
            if(j!=0)
            {
                if(pwddb.equals(pwd))
                {
                    out.println("<h1>Successfull login</h1>");
                    rd=sc.getRequestDispatcher("/Success");
                    rd.include(request, response);
                }
                 else
                {
                    rd=sc.getRequestDispatcher("/index.html");
                    rd.include(request, response);
                    out.println("Password mismatch");
                }
            }
            else
            {
                rd=sc.getRequestDispatcher("/index.html");
                rd.include(request, response);
                out.println("Invalid username");
            }
            out.println("</body>");
            out.println("</html>");
        }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login4.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Login4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login4.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Login4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
