// 클라이언트로 출력하기 - HTML 출력하기
package bitcamp.ex03;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

// @WebServlet 애노테이션
@WebServlet("/ex03/s3")
public class Servlet03 extends GenericServlet {

  private static final long serialVersionUID = 1L;

  @Override
  public void service(ServletRequest req, ServletResponse res)
      throws ServletException, IOException {

    // HTML을 출력할 때 MIME 타입에 HTML을 지정하지 않으면
    // 일반 텍스트 그대로 출력한다.
    res.setContentType("text/html;charset=UTF-8");
    PrintWriter out = res.getWriter();

    out.println("<html>");
    out.println("<head><title>servlet03</title></head>");
    out.println("<body>");
    out.println("<h1>");
    out.println("hello");
    out.println("안녕하세요");
    out.println("こんにちは");
    out.println("你好");
    out.println("مع السلامة؛ إلى اللقاء!");
    out.println("</h1>");
    out.println("</body>");
    out.println("</html>");
  }
}

