package com.eomcs.lms.handler;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Scanner;
import com.eomcs.lms.domain.Board;

public class BoardDeleteCommand implements Command {

  Scanner keyboard;

  public BoardDeleteCommand(Scanner keyboard) {
    this.keyboard = keyboard;
  }

  @Override
  public void execute(ObjectInputStream in, ObjectOutputStream out) {
    System.out.print("번호? ");
    int no = Integer.parseInt(keyboard.nextLine());

    try {
      out.writeUTF("/board/delete");
      out.flush();
      if (!in.readUTF().equals("OK"))
        throw new Exception("서버에서 해당 명령어를 처리하지 못합니다.");

      out.writeInt(no);
      out.flush();

      String status = in.readUTF();
      if (status.equals("OK"))
        System.out.println("서버에서 데이터 삭제 성공");
      else
        System.out.println("서버에서 데이터 삭제 실패");

    } catch (Exception e) {

    }
  }
}
