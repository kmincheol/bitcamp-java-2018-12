package bitcamp.lms;

import java.sql.Date;

public class App3 {

  static int count = 0;

  public static void main(String[] args) {
    java.util.Scanner keyboard = new java.util.Scanner(System.in);
    Date createdDate = new Date(System.currentTimeMillis());

    int index = 0;
    int indexPrint = 0;

    Board[] boardData = new Board[10]; // 레퍼런스
    for (; index < boardData.length; index++) {
      boardData[index] = new Board();

      System.out.print("번호? ");
      boardData[index].num = keyboard.nextInt();

      keyboard.nextLine();

      System.out.print("내용? ");
      boardData[index].contents = keyboard.nextLine();

      System.out.println();

      System.out.print("계속 입력하시겠습니까?(Y/n)");
      String str = keyboard.nextLine();

      System.out.println();

      if (!str.equalsIgnoreCase("y") && !str.equalsIgnoreCase("")) {
        printBoard(boardData);
        break;
      } else {
        count++;
      }
    }
  }

  static void printBoard(Board[] board) {
    for (int i = 0; i <= count; i++) {
      System.out.printf("%d , %s\n", board[i].num, board[i].contents);
    }
  }
}
