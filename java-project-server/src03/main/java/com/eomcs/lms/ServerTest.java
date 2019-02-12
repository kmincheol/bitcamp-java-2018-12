// 2단계 : 서버 실행 테스트
package com.eomcs.lms;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ServerTest {
  public static void main(String[] args) {

    try (Socket socket = new Socket("localhost", 8888);
        PrintWriter out = new PrintWriter(socket.getOutputStream());
        Scanner in = new Scanner(socket.getInputStream())) {
      System.out.println("서버와 연결되었음!");

//      Member member = new Member();
//      member.setNo(1);
//      member.setName("홍길동");
//      member.setEmail("aaaa@aaaa");
//      member.setPassword("1111");
//      member.setPhoto("aaa.gif");
//      member.setTel("1111-1111");

      // Member 객체를 서버로 serialize하라
      out.print("Hello");
      out.flush();

      // 또한 서버에서 serialize한 Member 객체를 받아라.
      System.out.println(in.nextLine());

    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("서버와 연결을 끊었음");
  }
}
