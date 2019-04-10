package com.eomcs.lms.controller;

import java.sql.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.eomcs.lms.domain.Lesson;
import com.eomcs.lms.service.LessonService;

@Controller("/lesson/add")
public class LessonAddController implements pageController {

  @Autowired
  LessonService lessonService;

  @Override
  public String excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
    if (request.getMethod().equals("GET")) {
      return "/lesson/form.jsp";
    }

    Lesson lesson = new Lesson();
    lesson.setTitle(request.getParameter("title"));
    lesson.setContents(request.getParameter("contents"));
    lesson.setStartDate(Date.valueOf(request.getParameter("startDate")));
    lesson.setEndDate(Date.valueOf(request.getParameter("endDate")));
    lesson.setTotalHours(Integer.parseInt(request.getParameter("totalHours")));
    lesson.setDayHours(Integer.parseInt(request.getParameter("dayHours")));

    lessonService.add(lesson);

    // 뷰 컴포넌트의 URL을 ServletRequest 보관소에 저장한다.
    return "redirect:list";
  }
}
