package bitcamp.lms;

import java.util.Scanner;

public class BoardHandler {
  static Scanner keyboard;
  static int LENGTH = 10;
  static Board[] board = new Board[LENGTH];
  static int indexBoard = 0;

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
      for (int indexprint = 0; indexprint < indexBoard; indexprint++) {
        System.out.printf("%d , %s\n", board[indexprint].num, board[indexprint].contents);
      }
    }
    System.out.println();
  }
}
