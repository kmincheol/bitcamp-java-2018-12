package ch23.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class CalculatorServer {
  public static void main(String[] args) {
    try (ServerSocket serverSocket = new ServerSocket(8888)) {

      System.out.println("서버실행...");

      while (true) {
        Socket socket = null;
        PrintStream out = null;
        BufferedReader in = null;

        try {
          socket = serverSocket.accept();
          in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
          out = new PrintStream(socket.getOutputStream());

          while (true) {
            String request = in.readLine();
            if (request.equalsIgnoreCase("quit")) {
              out.println("안녕히 가세요");
              out.flush();
              break;
            }
          

            try {
              String[] input = in.readLine().split(" ");

              int a = Integer.parseInt(input[0]);
              String op = input[1];
              int b = Integer.parseInt(input[2]);

              int result = 0;
              switch (op) {
                case "+":
                  result = a + b;
                  break;
                case "-":
                  result = a - b;
                  break;
                case "*":
                  result = a * b;
                  break;
                case "/":
                  result = a / b;
                  break;
                default:
                  out.printf("연산자를 지원하지 않습니다.( %s )", op);
                  out.flush();
                  continue;
              }

              out.printf("결과 = %d", result);
              out.flush();
            } catch (Exception e) {
              try {
                out.println("식의 형식이 잘못되었습니다.");
                out.flush();
              } catch (Exception e2) {}
            }
          }
        } catch (Exception e) {
          e.printStackTrace();
        } finally {
          try {in.close();} catch (Exception e) {}
          try {out.close();} catch (Exception e) {}
          try {socket.close();} catch (Exception e) {}
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
