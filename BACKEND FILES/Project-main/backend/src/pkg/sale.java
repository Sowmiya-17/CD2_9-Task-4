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
public class sale extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public sale() {
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
        String Item-id = request.getParameter("item");
    String quantity = request.getParameter("quantity");
        String rate = request.getParameter("rate");
    
        try{
            Connection con = (Connection) DatabaseConnect.connect();
            PreparedStatement ps = (PreparedStatement) con.prepareStatement("insert into appointment values(?,?,?)");
            ps.setString(1, item);
            ps.setString(2, quantity);
            ps.setString(3, rate);
            
            int i = ps.executeUpdate();
            
            if(i>0)
                
                
            }catch(Exception e2){
                System.out.println(e2);
            }
        out.close();
}
    }