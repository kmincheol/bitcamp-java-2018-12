package com.eomcs.lms.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.eomcs.lms.context.RequestMapping;
import com.eomcs.lms.domain.Member;
import com.eomcs.lms.service.MemberService;

@Controller
public class MemberSearchController {

  @Autowired
  MemberService memberService;

  @RequestMapping("/member/search")
  public String excute(HttpServletRequest request, HttpServletResponse response) throws Exception {

    String keyword = request.getParameter("keyword");

    List<Member> members = memberService.list(keyword);
    request.setAttribute("list", members);

    // 뷰 컴포넌트의 URL을 ServletRequest 보관소에 저장한다.
    return "/member/search.jsp";
  }
}
