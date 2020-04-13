import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author sindh
 */
@WebServlet(urlPatterns = {"/Success"})
public class Success extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        String user=request.getParameter("tbuser");
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection con = DriverManager.getConnection( "jdbc:derby://localhost:1527/logindb" ,"sa","sqlserver");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from loginbean where uname='"+user+"'");
        String name=null,section=null,branch=null,gender=null,regdno=null;
        float cgpa=0;
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Success</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println();
            while(rs.next())
            {
                name=rs.getString("name");
                regdno=rs.getString("regdno");
                gender=rs.getString("gender");
                cgpa=rs.getFloat("cgpa");
                branch=rs.getString("branch");
                section=rs.getString("section");
            }
            out.println("<font style=font-size:20px>Hello "+name+"!</font><br /><br />");
            out.println("<font style=font-size:15px;font-family:verdana;color:blue>Your details are:</font><br /><br />");
            out.println("Registration number : "+regdno+"<br />");
            out.println("Gender : "+gender+"<br />");
            out.println("Branch : "+branch+"<br />");
            out.println("Section : "+section+"<br />");
            out.println("CGPA : "+cgpa+"<br/>");
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
            Logger.getLogger(Success.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Success.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Success.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Success.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
