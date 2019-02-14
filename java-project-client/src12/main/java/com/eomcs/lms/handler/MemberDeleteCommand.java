package com.eomcs.lms.handler;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import com.eomcs.lms.Agent.MemberAgent;

public class MemberDeleteCommand implements Command {

  Scanner keyboard;

  public MemberDeleteCommand(Scanner keyboard) {
    this.keyboard = keyboard;
  }

  @Override
  public void execute(ObjectInputStream in, ObjectOutputStream out) {
    System.out.print("번호? ");
    int no = Integer.parseInt(keyboard.nextLine());

    try {
      MemberAgent.delete(no, in, out);
      System.out.println("데이터 삭제 성공");
    } catch (Exception e) {
      System.out.printf("게시글 상세 정보 출력 오류! : %s", e.getMessage());
    }
  }
}
