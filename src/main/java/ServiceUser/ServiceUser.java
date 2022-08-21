package ServiceUser;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.PrintWriter;

/**
 * Servlet implementation class ServiceUser
 */
@WebServlet("/ServiceUser")
public class ServiceUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServiceUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out;
		String docType ="<!DOCTYPE html>\n";
		
	
		try
		{
		
		String  username = request.getParameter("username");
		String  mobile = request.getParameter("mobile");
		String  city = request.getParameter("city");
		String  address = request.getParameter("address");
		String  services = request.getParameter("services");
		String  datetime = request.getParameter("datetime");
		
		
		
		out = response.getWriter();
		 request.setCharacterEncoding("UTF-8");         
		 response.setContentType("text/html; charset=UTF-8");
		 out.println
	      (docType +
	       "<HTML>\n" +
	       "<head>\n");
		 out.println("<style>\r\n"
		 		+ "		body{\r\n"
		 		+ "			font-family: Arial, Helvetica, sans-serif;\r\n"
		 		+ "			background-color: white;\r\n"
		 		+ "			margin: 100px 300px;\r\n"
		 		+ "			color: green;\r\n"
		 		+ "			text-align: center;\r\n"
		 		+ "			border: 2px solid green;\r\n"
		 		+ "			border-radius: 8px;\r\n"
		 		+ "			padding: 14px;\r\n"
		 		+ "		}\r\n"
		 		+ "	</style>\r\n"
		 		+ "</head>");
		 
		 out.println("<BODY ALIGN=\"CENTER\">");
		 out.println("<form action=\"SendOrderUser\" method=\"post\">");
		 out.println("<h2 ALIGN=\"CENTER\"> User service details  </H1>\n");
		 
		out.println("<table width=\"80%\" align=\"center\" border>");
		out.println("<tr>");
		out.println("<td>UserName</td>");
		out.println("<td>" + username + "</td>");
		out.println("<td>Mobile</td>");
		out.println("<td>" + mobile + "</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>city</td>");
		out.println("<td>" + city + "</td>");
		out.println("<td>address</td>");
		out.println("<td>" + address + "</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>services</td>");
		out.println("<td>" + services + "</td>");
		out.println("<td>datetime</td>");
		out.println("<td>" + datetime + "</td>");
		out.println("</tr>");
		
		 out.println("</table>");
		 out.println("</br><input type=\"Submit\" value=\"Send Order\" class=\"button\">");
		 out.println("</Form>");
		 out.println("</BODY></HTML>");
		 out.close();
		 try {
			 Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException("Can't register driver know !");
		}
		 
		 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/beautidb","root","");
		 Statement st = conn.createStatement();
		 String sql = "insert into user (username,mobile,city,address,services,datetime) values('"+username+"','"+mobile+"','"+city+"','"+address+"','"+services+"','"+datetime+"')";
		 int i = st.executeUpdate(sql);
		 if (i > 0) {
			 out.println("Data is Successfully Inserted into Custmer Table");
		}
         
         																																																																								w
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		doGet(request, response);
	}

}
