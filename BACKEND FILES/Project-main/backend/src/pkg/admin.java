package pkg;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Feedback
 */
public class adminpage extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public appointment() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        
      }

    

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
        
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        String name = request.getParameter("company");
        String doctor = request.getParameter("cash");
        String phone = request.getParameter("password");
        try{
            Connection con = (Connection) DatabaseConnect.connect();
            PreparedStatement ps = (PreparedStatement) con.prepareStatement("insert into appointment values(?,?,?)");
            ps.setString(1, company);
            ps.setString(2, cash);
            ps.setString(3, password);
            int i = ps.executeUpdate();
            
            if(i>0)
                
            }catch(Exception e2){
                System.out.println(e2);
            }
        out.close();
}
    }
