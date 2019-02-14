package com.eomcs.lms.handler;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Scanner;
import com.eomcs.lms.Agent.MemberAgent;
import com.eomcs.lms.domain.Member;

public class MemberListCommand implements Command {

  Scanner keyboard;

  public MemberListCommand(Scanner keyboard) {
    this.keyboard = keyboard;
  }

  @Override
  public void execute(ObjectInputStream in, ObjectOutputStream out) {
    try {
      List<Member> members = MemberAgent.list(in, out);
      for (Member m : members) {
        System.out.printf("%3d, %-4s, %-20s, %-15s, %s\n", m.getNo(), m.getName(), m.getEmail(),
            m.getTel(), m.getRegisteredDate());
      }
    } catch (Exception e) {
      System.out.printf("게시글 목록 출력 오류! : %s", e.getMessage());
    }
  }
}
