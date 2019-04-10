package com.eomcs.lms.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.eomcs.lms.service.MemberService;

@Controller("/member/delete")
public class MemberDeleteController implements pageController {

  @Autowired
  MemberService memberService;

  @Override
  public String excute(HttpServletRequest request, HttpServletResponse response) throws Exception {

    int no = Integer.parseInt(request.getParameter("no"));

    if (memberService.delete(no) == 0)
      throw new Exception("해당 번호의 회원이 없습니다.");
    return "redirect:list";

  }
}
