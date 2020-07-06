import com.sun.net.httpserver.HttpServer;
import sun.net.httpserver.HttpServerImpl;

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
 * @create: 2020-07-05 15:00
 **/
public class MyFirstDynamicResource extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.通过query String ，取到wd这个name所对应的value
        String wd = req.getParameter("wd");
        //2.返回的 Content-Type 是text/html； 字符集是 utf-8
        resp.setContentType("text/html; charset=utf-8");
        PrintWriter writer = resp.getWriter();
        //3.输出响应的内容
        writer.println("<h1> 我是 /s 资源</h1>");
        writer.println("<p> 用户查找的关键字是：" + wd + "</p>");
    }
}
