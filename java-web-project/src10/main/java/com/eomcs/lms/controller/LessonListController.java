package com.eomcs.lms.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.eomcs.lms.domain.Lesson;
import com.eomcs.lms.service.LessonService;

@Controller("/lesson/list")
public class LessonListController implements pageController {

  @Autowired
  LessonService lessonService;

  @Override
  public String excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
    List<Lesson> lessons = lessonService.list();

    request.setAttribute("list", lessons);

    // 뷰 컴포넌트의 URL을 ServletRequest 보관소에 저장한다.
    return "/lesson/list.jsp";
  }
}
