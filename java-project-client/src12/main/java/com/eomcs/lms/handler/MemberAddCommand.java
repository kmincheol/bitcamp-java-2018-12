package com.eomcs.lms.handler;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.Agent.MemberAgent;
import com.eomcs.lms.domain.Member;

public class MemberAddCommand implements Command {

  Scanner keyboard;

  public MemberAddCommand(Scanner keyboard) {
    this.keyboard = keyboard;
  }

  @Override
  public void execute(ObjectInputStream in, ObjectOutputStream out) {
    Member member = new Member();

    System.out.print("번호? ");
    member.setNo(Integer.parseInt(keyboard.nextLine()));

    System.out.print("이름? ");
    member.setName(keyboard.nextLine());

    System.out.print("이메일? ");
    member.setEmail(keyboard.nextLine());

    System.out.print("암호? ");
    member.setPassword(keyboard.nextLine());

    System.out.print("사진? ");
    member.setPhoto(keyboard.nextLine());

    System.out.print("전화? ");
    member.setTel(keyboard.nextLine());

    member.setRegisteredDate(new Date(System.currentTimeMillis()));

    try {
      MemberAgent.add(member, in, out);
      System.out.println("데이터 추가 성공");
    } catch (Exception e) {
      System.out.printf("수업 데이터 저장 오류! : %s\n", e.getMessage());
    }
  }
}
