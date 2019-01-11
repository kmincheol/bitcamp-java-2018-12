package bitcamp.lms;

import java.util.Date;
import java.util.Scanner;

public class MemberHandler {
  static Date createdDate = new Date(System.currentTimeMillis());
  static int LENGTH = 10;
  static Scanner keyboard;
  static Member[] member = new Member[LENGTH];
  static int indexMember = 0;
  
  static void addMember() {
    Member members = new Member();
    System.out.print("번호? ");
    members.num = keyboard.nextInt();

    keyboard.nextLine();

    System.out.print("이름? ");
    members.name = keyboard.nextLine();

    System.out.print("이메일? ");
    members.email = keyboard.nextLine();

    System.out.print("암호? ");
    members.pwd = keyboard.nextInt();

    keyboard.nextLine();

    System.out.print("사진? ");
    members.pic = keyboard.nextLine();

    System.out.print("전화? ");
    members.callNum = keyboard.nextLine();

    System.out.println("저장하였습니다.");
    System.out.println();
    member[indexMember] = members;
    indexMember++;

    System.out.println();
  }

  static void listMember() {
    if (indexMember == 0) {
      System.out.println("저장된 정보가 없습니다. 명령을 다시 입력하세요");
    } else {
      for (int indexprint = 0; indexprint < indexMember; indexprint++) {
        System.out.printf("%d, %s, %s, %s\n", member[indexprint].num, member[indexprint].name,
            member[indexprint].callNum, createdDate);
      }
    }
    System.out.println();
  }
}
