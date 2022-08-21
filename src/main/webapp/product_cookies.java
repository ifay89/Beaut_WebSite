package RepeatVisitor;
import java.io.IOException;
@WebServlet("/repeat-visitor")
public class RepeatVisitor extends HttpServlet {
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
      throws ServletException, IOException {
        String name = request.getParameter("name").trim();
        Cookie ck=new Cookie("product",name);//creating cookie object  
        cookie.setMaxAge(60);
        response.addCookie(ck);
        out.print("<h3>Cookies are created. Click on the below button to get cookies.");
        out.print("<form action='get_cookies' method='POST'>");  
    	        out.print("<input type='submit' value='Get Cookie'>");  
    	        out.print("</form>");  
}
}