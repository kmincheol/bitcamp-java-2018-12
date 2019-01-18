package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.domain.Board;

public class BoardHandler {

  public Scanner keyboard;
  BoardList boardList = new BoardList();

  public BoardHandler(Scanner bk) {
    keyboard = bk;
    // TODO Auto-generated constructor stub
  }

  public void listBoard() {
    Board[] boards = boardList.toArray(); // 목록을 배열로 만들어줌
    for (Board board : boards) {
      System.out.printf("%3d, %-20s, %s, %d\n", board.getNo(), board.getContents(),
          board.getCreatedDate(), board.getViewCount());
    }
  }

  public void addBoard() {
    // 인스턴스 생성
    Board board = new Board();

    System.out.print("번호? ");
    board.setNo(Integer.parseInt(this.keyboard.nextLine()));

    System.out.print("내용? ");
    board.setContents(this.keyboard.nextLine());

    board.setCreatedDate(new Date(System.currentTimeMillis()));

    board.setViewCount(0);

    boardList.add(board);

    System.out.println("저장하였습니다.");
  }

}
