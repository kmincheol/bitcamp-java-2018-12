package bitcamp.lms;

import java.util.Date;
import java.util.Scanner;
import bitcamp.lms.handler.BoardHandler;
import bitcamp.lms.handler.LessonHandler;
import bitcamp.lms.handler.MemberHandler;

public class App {

  static Scanner keyboard = new Scanner(System.in);

  public static void main(String[] args) {
    LessonHandler.keyboard = keyboard;
    MemberHandler.keyboard = keyboard;
    BoardHandler.keyboard = keyboard;

    while (true) {

      String str = prompt();

      if (str.equals("/lesson/add")) {
        LessonHandler.addLesson();
      } else if (str.equals("/member/add")) {
        MemberHandler.addMember();
      } else if (str.equals("/board/add")) {
        BoardHandler.addBoard();
      } else if (str.equals("/lesson/list")) {
        LessonHandler.listLesson();
      } else if (str.equals("/member/list")) {
        MemberHandler.listMember();
      } else if (str.equals("/board/list")) {
        BoardHandler.listBoard();
      } else if (str.equals("board/view")) {
        System.out.println("실행할 수 없는 명령입니다.");
        System.out.println();
      } else if (str.equals("quit")) {
        System.out.println("안녕!");
        break;
      }
    }
  }

  static String prompt() {
    System.out.print("명령> ");
    return keyboard.nextLine();
  }
}
