package com.eomcs.lms.handler;

import java.util.Scanner;
import com.eomcs.lms.dao.MemberDao;
import com.eomcs.lms.dao.mariadb.MemberDaoImpl;
import com.eomcs.lms.domain.Member;

public class MemberUpdateCommand implements Command {

  Scanner keyboard;
  MemberDao memberDao;

  public MemberUpdateCommand(Scanner keyboard, MemberDaoImpl memberDao) {
    this.keyboard = keyboard;
    this.memberDao = memberDao;
  }

  @Override
  public void execute() {

    try {

      System.out.print("번호? ");
      Member member = new Member();
      member.setNo(Integer.parseInt(keyboard.nextLine()));

      System.out.printf("이름? ");
      String input = keyboard.nextLine();
      if (input.length() > 0)
        member.setName(input);

      System.out.printf("이메일? ");
      if ((input = keyboard.nextLine()).length() > 0)
        member.setEmail(input);

//      System.out.printf("암호(********)? ");
//      if ((input = keyboard.nextLine()).length() > 0)
//        member.setPassword(input);

//      System.out.printf("사진(%s)? ", member.getPhoto());
//      if ((input = keyboard.nextLine()).length() > 0)
//        member.setPhoto(input);

      System.out.printf("전화? ");
      if ((input = keyboard.nextLine()).length() > 0)
        member.setTel(input);

      memberDao.update(member);
      System.out.println("변경했습니다.");

    } catch (Exception e) {
      System.out.printf("실행 오류! : %s\n", e.getMessage());
    }
  }
}
