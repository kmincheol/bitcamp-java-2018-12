package bitcamp.lms;

import java.util.Date;

public class App {

  public static void main(String[] args) {
    java.util.Scanner keyboard = new java.util.Scanner(System.in);
    Date createdDate = new Date(System.currentTimeMillis());

    int indexLesson = 0;
    int indexMember = 0;
    int indexBoard = 0;

    Lesson[] lesson = new Lesson[10];
    Member[] member = new Member[10];
    Board[] board = new Board[10];

    while (true) {

      System.out.print("명령> ");
      String str = keyboard.nextLine();

      if (str.equals("/lesson/add")) {
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
      } else if (str.equals("/member/add")) {
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
      } else if (str.equals("/board/add")) {
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
      } else if (str.equals("/lesson/list")) {
        if (indexLesson == 0) {
          System.out.println("저장된 정보가 없습니다. 명령을 다시 입력하세요");
        } else {
          for (int indexprint = 0; indexprint < indexLesson; indexprint++) {
            System.out.printf("%d, %s, %s ~ %s, %d\n", lesson[indexprint].num,
                lesson[indexprint].className, lesson[indexprint].starDate,
                lesson[indexprint].endDate, lesson[indexprint].totalDate);
          }
        }
        System.out.println();
      } else if (str.equals("/member/list")) {
        if (indexMember == 0) {
          System.out.println("저장된 정보가 없습니다. 명령을 다시 입력하세요");
        } else {
          for (int indexprint = 0; indexprint < indexMember; indexprint++) {
            System.out.printf("%d, %s, %s, %s\n", member[indexprint].num, member[indexprint].name,
                member[indexprint].callNum, createdDate);
          }
        }
        System.out.println();
      } else if (str.equals("/board/list")) {
        if (indexBoard == 0) {
          System.out.println("저장된 정보가 없습니다. 명령을 다시 입력하세요");
        } else {
          for (int indexprint = 0; indexprint < indexMember; indexprint++) {
            System.out.printf("%d , %s\n", board[indexprint].num, board[indexprint].contents);
          }
        }
        System.out.println();
      } else if (str.equals("board/view")) {
        System.out.println("실행할 수 없는 명령입니다.");
        System.out.println();
      } else if (str.equals("quit")) {
        System.out.println("안녕!");
        break;
      }
    }
  }
}
