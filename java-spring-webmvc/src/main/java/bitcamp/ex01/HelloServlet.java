package bitcamp.ex01;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ex01/s1")
public class HelloServlet extends GenericServlet {

  @Override
  public void service(ServletRequest req, ServletResponse res)
      throws ServletException, IOException {
    // TODO Auto-generated method stub
    res.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = res.getWriter();
    out.print("dzd");
  }

}

