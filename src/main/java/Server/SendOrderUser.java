package Server;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SendOrderUser")
public class SendOrderUser extends HttpServlet {
	private static final long serialVersionUID = 545646413L;
    public SendOrderUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
		
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		response.setHeader("Content-Type", "text/html");
		out = response.getWriter();
		 out.println
	      (docType +
	       "<HTML>\n" +
	       "<head>\n");
		 out.println("<style>\r\n"
		 		+ "		body{\r\n"
		 		+ "			font-family: Arial, Helvetica, sans-serif;\r\n"
		 		+ "			background-color: #e9a76e"
		 		+ "			margin: 50px 300px;\r\n"
		 		+ "			text-align: center;\r\n"
		 		+ "			border: 5px solid green;\r\n"
		 		+ "			border-radius: 5px;\r\n"
		 		+ "		}\r\n"
		 		
		 		+ "	</style>\r\n"
		 		+ "</head>");
		 
		 out.println("<BODY ALIGN=\"CENTER\">");
		 out.println("<h4 ALIGN=\"CENTER\">Your request has been successfully sent  </h2>\n");
	
		 out.println("</BODY></HTML>");
		 out.close();
		
		}
		catch(Exception e)
		{
			
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
