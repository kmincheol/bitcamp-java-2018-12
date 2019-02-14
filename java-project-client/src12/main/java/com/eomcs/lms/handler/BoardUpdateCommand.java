package com.eomcs.lms.handler;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import com.eomcs.lms.Agent.BoardAgent;
import com.eomcs.lms.domain.Board;

public class BoardUpdateCommand implements Command {

  Scanner keyboard;

  public BoardUpdateCommand(Scanner keyboard) {
    this.keyboard = keyboard;
  }

  @Override
  public void execute(ObjectInputStream in, ObjectOutputStream out) {

    System.out.print("번호? ");
    int no = Integer.parseInt(keyboard.nextLine());


    try {

      Board board = BoardAgent.get(no, in, out);

      Board temp = board.clone();

      System.out.printf("내용? ");
      String input = keyboard.nextLine();
      if (input.length() > 0)
        temp.setContents(input);

      BoardAgent.update(temp, in, out);

      System.out.println("게시글 업데이트 성공");
    } catch (Exception e) {
      System.out.println("게시글 업데이트 실패");
    }
  }
}
