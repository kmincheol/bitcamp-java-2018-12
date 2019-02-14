package com.eomcs.lms.handler;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import com.eomcs.lms.Agent.BoardAgent;
import com.eomcs.lms.domain.Board;

public class BoardDetailCommand implements Command {

  Scanner keyboard;

  public BoardDetailCommand(Scanner keyboard) {
    this.keyboard = keyboard;
  }

  @Override
  public void execute(ObjectInputStream in, ObjectOutputStream out) {
    System.out.print("번호? ");
    int no = Integer.parseInt(keyboard.nextLine());

    try {
      Board board = BoardAgent.get(no, in, out);
      
      System.out.printf("내용: %s\n", board.getContents());
      System.out.printf("작성일: %s\n", board.getCreatedDate());

    } catch (Exception e) {
      System.out.printf("게시글 상세 정보 출력 오류! : %s", e.getMessage());
    }
  }
}
