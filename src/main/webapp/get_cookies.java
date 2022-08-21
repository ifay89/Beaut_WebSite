package RepeatVisitor;
import java.io.IOException;

@WebServlet("/repeat-visitor")
public class RepeatVisitor extends HttpServlet {
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
      throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
          for(Cookie c: cookies) {
            out.println
          ("<TR>\n" +
           "  <TD>" + c.getName() + "\n" +
           "  <TD>" + c.getValue());
          }
        }
        
    out.println("</TABLE></BODY></HTML>");

    
}
}