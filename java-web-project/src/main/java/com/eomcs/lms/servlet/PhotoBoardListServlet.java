package com.eomcs.lms.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.context.ApplicationContext;
import com.eomcs.lms.domain.PhotoBoard;
import com.eomcs.lms.service.PhotoBoardService;

@SuppressWarnings("serial")
@WebServlet("/photoboard/list")
public class PhotoBoardListServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    PhotoBoardService photoBoardService =
        ((ApplicationContext) this.getServletContext().getAttribute("iocContainer"))
            .getBean(PhotoBoardService.class);
    response.setContentType("text/html;charset=UTF-8");

    PrintWriter out = response.getWriter();
    List<PhotoBoard> photoBoards = photoBoardService.list(0, null);
    request.setAttribute("photoBoards", photoBoards);

    request.getRequestDispatcher("list.jsp").include(request, response);

  }
}
