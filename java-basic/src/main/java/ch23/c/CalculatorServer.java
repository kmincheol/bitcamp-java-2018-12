// 계산기 서버 만들기
package ch23.c;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class CalculatorServer {
  public static void main(String[] args) {
    try (Scanner keyboard = new Scanner(System.in);
        ServerSocket serverSocket = new ServerSocket(8888)){
      
      try(Socket socket = serverSocket.accept();
          PrintWriter out = new PrintWriter(socket.getOutputStream());
          Scanner in = new Scanner(socket.getInputStream())) {
        
        out.write("계산기 서버에 오신걸 환영합니다!\n");
        out.write("계산식을 입력하세요!\n");
        out.write("예) 23 + 7\n");
        out.flush();
        
        
        String request = in.nextLine();
        System.out.println(request);
      }
      
      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
