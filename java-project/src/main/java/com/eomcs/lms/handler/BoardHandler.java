package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.domain.Board;
import com.eomcs.util.ArrayList;

public class BoardHandler {

  Scanner keyboard;
  ArrayList<Board> list;


  public BoardHandler(Scanner keyboard) {
    this.keyboard = keyboard;
    this.list = new ArrayList<>();
  }

  public void listBoard() {
    Board[] boards = list.toArray(new Board[0]);
    for (Board board : boards) {
      System.out.printf("%3d, %-20s, %s, %d\n", board.getNo(), board.getContents(),
          board.getCreatedDate(), board.getViewCount());
    }
  }

  public void addBoard() {

    Board board = new Board();

    System.out.print("번호? ");
    board.setNo(Integer.parseInt(keyboard.nextLine()));

    System.out.print("내용? ");
    board.setContents(keyboard.nextLine());

    board.setCreatedDate(new Date(System.currentTimeMillis()));

    board.setViewCount(0);

    list.add(board);

    System.out.println("저장하였습니다.");
  }

  public void detailBoard() {
    // TODO Auto-generated method stub
    
  }

  public void deleteBoard() {
    // TODO Auto-generated method stub
    
  }

  public void updateBoard() {
    // TODO Auto-generated method stub
    
  }
  private int promptLessonNo() {
    System.out.print("번호? ");
    return Integer.parseInt(keyboard.nextLine());
  }
}


