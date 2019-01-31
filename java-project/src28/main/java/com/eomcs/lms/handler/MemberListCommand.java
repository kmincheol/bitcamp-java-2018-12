package com.eomcs.lms.handler;

import java.util.List;
import java.util.Scanner;
import com.eomcs.lms.domain.Member;

public class MemberListCommand implements Command {

  Scanner keyboard;
  List<Member> list;

  public MemberListCommand(Scanner keyboard, List<Member> list) {
    this.keyboard = keyboard;
    this.list = list; // 파라미터로 주입된 의존 객체를 저장한다.
  }

  public void execute() {
    Member[] members = list.toArray(new Member[] {});
    for (Member member : members) {
      System.out.printf("%3d, %-4s, %-20s, %-15s, %s\n", member.getNo(), member.getName(),
          member.getEmail(), member.getTel(), member.getRegisteredDate());
    }
  }
}
