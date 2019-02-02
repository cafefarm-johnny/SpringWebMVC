package com.johnny;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// HttpServlet을 확장해야 서블릿이 될 수 있다.
public class HelloServlet extends HttpServlet {

    // init()은 서블릿 컨테이너가 서블릿 인스턴스의 init()을 호출하여 최초 1번 초기화된다.
    @Override
    public void init() throws ServletException {
        System.out.println("init()!!!");;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet()!!!");
        resp.getWriter().println("<html>");
        resp.getWriter().println("<head></head>");
        resp.getWriter().println("<body>");
        resp.getWriter().println("<h1>Hello Servlet!!!</h1>");
        resp.getWriter().println("</body>");
        resp.getWriter().println("</html>");
    }

    @Override
    public void destroy() {
        System.out.println("destroy()!!!");
    }
}
