package com.eomcs.lms.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.eomcs.lms.domain.Member;
import com.eomcs.lms.service.MemberService;

@Controller("/member/list")
public class MemberListController implements pageController {

  @Autowired
  MemberService memberService;

  @Override
  public String excute(HttpServletRequest request, HttpServletResponse response) throws Exception {

    List<Member> members = memberService.list(null);
    request.setAttribute("list", members);

    // 뷰 컴포넌트의 URL을 ServletRequest 보관소에 저장한다.
    return "/member/list.jsp";
  }
}
