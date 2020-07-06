import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @program: 第一组动态资源
 * @description:
 * @author: Mx
 * @create: 2020-07-05 15:52
 **/
public class MyFirstDynamicResource01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String target = req.getParameter("target");
        resp.setContentType("text/html; charset=utf-8");
        PrintWriter writer = resp.getWriter();
        writer.println("<p> Hello  " + target + "</p>");
    }
}
