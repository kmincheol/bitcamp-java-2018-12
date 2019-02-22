package com.eomcs.lms.handler;

import java.util.Scanner;
import com.eomcs.lms.dao.BoardDao;
import com.eomcs.lms.dao.mariadb.BoardDaoImpl;

public class BoardDeleteCommand implements Command {

  Scanner keyboard;
  BoardDao boardDao;

  public BoardDeleteCommand(Scanner keyboard, BoardDaoImpl boardDao) {
    this.keyboard = keyboard;
    this.boardDao = boardDao;
  }

  @Override
  public void execute() {
    System.out.print("번호? ");
    int no = Integer.parseInt(keyboard.nextLine());

    try {
      if (boardDao.delete(no) == 0) {
        System.out.println("해당 번호의 게시물이없습니다.");
        return;
      }
      System.out.println("삭제했습니다.");

    } catch (Exception e) {
      System.out.printf("실행 오류! : %s\n", e.getMessage());
    }
  }
}
