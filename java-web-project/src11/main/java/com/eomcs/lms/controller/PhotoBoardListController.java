package com.eomcs.lms.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.eomcs.lms.context.RequestMapping;
import com.eomcs.lms.domain.PhotoBoard;
import com.eomcs.lms.service.PhotoBoardService;

@Controller
public class PhotoBoardListController {

  @Autowired
  PhotoBoardService photoBoardService;

  @RequestMapping("/photoboard/list")
  public String excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
    List<PhotoBoard> boards = photoBoardService.list(0, null);

    request.setAttribute("list", boards);

    // 뷰 컴포넌트의 URL을 ServletRequest 보관소에 저장한다.
    return "/photoboard/list.jsp";
  }
}
