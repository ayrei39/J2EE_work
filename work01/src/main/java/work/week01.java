package work;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.*;

@WebServlet(urlPatterns = "/user/login")
public class week01 implements Servlet {
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.setContentType("text/html");
        //2. 获取文档输出流
        PrintWriter out = servletResponse.getWriter();
        FileInputStream ip = new FileInputStream("src/main/webapp/index.html");
        BufferedReader rd = new BufferedReader(new InputStreamReader(ip));
        String str = null;
        while ((str = rd.readLine()) != null)
        {
            out.println(str);
        }
        ip.close();
        rd.close();
    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {

    }
}
