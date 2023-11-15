package pkg;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class list
 */
public class list extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public list() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		ResultSet rs;
		Connection con=null;
		try{
			 con = (Connection) DatabaseConnect.connect();
		}
		catch(Exception e){
		}
		if(con==null){
			out.println("<h2>DB connection failed</h2>");
			System.out.println("con"+con);
		}
		else{
			//out.println("Connected to DB</h2>");
			try{
				String location = request.getParameter("location");
				String specialist = request.getParameter("specialist");
				String qry="select * from doctors where location=? and specialist=?";
				PreparedStatement ps= con.prepareStatement(qry);
				ps.setString(1, location);
				ps.setString(2, specialist);
				rs=ps.executeQuery();
	}catch(Exception e2){
	}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
