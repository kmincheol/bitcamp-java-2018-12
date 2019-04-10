package com.eomcs.lms.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;

@Controller("/auth/logout")
public class LogoutController implements pageController {

  @Override
  public String excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
    request.getSession().invalidate();
    return "redirect:" + request.getServletContext().getContextPath();
  }
}


