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
import com.eomcs.lms.domain.Lesson;
import com.eomcs.lms.domain.PhotoBoard;
import com.eomcs.lms.domain.PhotoFile;
import com.eomcs.lms.service.LessonService;
import com.eomcs.lms.service.PhotoBoardService;

@WebServlet("/photoboard/detail")
@SuppressWarnings("serial")
public class PhotoBoardDetailServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    LessonService lessonService =
        ((ApplicationContext) this.getServletContext().getAttribute("iocContainer"))
            .getBean(LessonService.class);
    PhotoBoardService photoBoardService =
        ((ApplicationContext) this.getServletContext().getAttribute("iocContainer"))
            .getBean(PhotoBoardService.class);

    response.setContentType("text/html;charset=UTF-8");

    int no = Integer.parseInt(request.getParameter("no"));

    PhotoBoard board = photoBoardService.get(no);
    List<Lesson> lessons = lessonService.list();
    List<PhotoFile> files = board.getFiles();
    request.setAttribute("photoBoard", board);
    request.setAttribute("lessons", lessons);
    request.setAttribute("files", files);


    request.getRequestDispatcher("detail.jsp").include(request, response);

  }
}
