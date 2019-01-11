package bitcamp.lms;

import java.util.Date;
import java.util.Scanner;

public class App {

  static Scanner keyboard = new Scanner(System.in);
  static Date createdDate = new Date(System.currentTimeMillis());

  static Lesson[] lesson = new Lesson[10];
  static Member[] member = new Member[10];
  static Board[] board = new Board[10];
  
  static int indexLesson = 0;
  static int indexMember = 0;
  static int indexBoard = 0;

  public static void main(String[] args) {

    while (true) {

      String str = prompt();

      if (str.equals("/lesson/add")) {
        addLesson();
      } else if (str.equals("/member/add")) {
        addMember();
      } else if (str.equals("/board/add")) {
        addBoard();
      } else if (str.equals("/lesson/list")) {
        listLesson();
      } else if (str.equals("/member/list")) {
        listMember();
      } else if (str.equals("/board/list")) {
        listBoard();
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

  static void addLesson() {
    Lesson lessons = new Lesson();
    System.out.print("번호? ");
    lessons.num = keyboard.nextInt();

    keyboard.nextLine();

    System.out.print("수업명? ");
    lessons.className = keyboard.nextLine();

    System.out.print("수업내용? ");
    lessons.classContents = keyboard.nextLine();

    System.out.print("시작일? ");
    lessons.starDate = keyboard.nextLine();

    System.out.print("종료일? ");
    lessons.endDate = keyboard.nextLine();

    System.out.print("총수업시간? ");
    lessons.totalDate = keyboard.nextInt();

    System.out.print("일수업시간? ");
    lessons.totalDay = keyboard.nextInt();
    keyboard.nextLine();

    System.out.println("저장하였습니다.");
    System.out.println();
    lesson[indexLesson] = lessons;
    indexLesson++;
  }

  static void listLesson() {
    if (indexLesson == 0) {
      System.out.println("저장된 정보가 없습니다. 명령을 다시 입력하세요");
    } else {
      for (int indexprint = 0; indexprint < indexLesson; indexprint++) {
        System.out.printf("%d, %s, %s ~ %s, %d\n", lesson[indexprint].num,
            lesson[indexprint].className, lesson[indexprint].starDate, lesson[indexprint].endDate,
            lesson[indexprint].totalDate);
      }
    }
    System.out.println();
  }

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

  static void addBoard() {
    Board boards = new Board();
    System.out.print("번호? ");
    boards.num = keyboard.nextInt();

    keyboard.nextLine();

    System.out.print("내용? ");
    boards.contents = keyboard.nextLine();

    System.out.println("저장하였습니다.");
    System.out.println();
    board[indexBoard] = boards;
    indexBoard++;

    System.out.println();
  }

  static void listBoard() {
    if (indexBoard == 0) {
      System.out.println("저장된 정보가 없습니다. 명령을 다시 입력하세요");
    } else {
      for (int indexprint = 0; indexprint < indexMember; indexprint++) {
        System.out.printf("%d , %s\n", board[indexprint].num, board[indexprint].contents);
      }
    }
    System.out.println();
  }
}
