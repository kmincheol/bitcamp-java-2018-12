package ch23.c;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class CalculatorProcessor {
  Socket socket;
  BufferedReader in;
  PrintStream out;

  public CalculatorProcessor(Socket socket) throws Exception {
    this.socket = socket;
    this.in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    this.out = new PrintStream(socket.getOutputStream());
  }

  public void excute() throws Exception {
    try (Socket socket = this.socket; BufferedReader in = this.in; PrintStream out = this.out) {

      sendGreeting();

      while (true) {
        String request = in.readLine();
        if (isQuit(request))
          break;
        docalculate(request);
      }
    }
  }

  private void sendGreeting() {
    out.println("계산기 서버에 오신걸 환영합니다!");
    out.println("계산식을 입력하세요!");
    out.println("예) 23 + 7");
    out.println();
  }

  void docalculate(String request) {
    try {
      // 한 줄을 읽어들여 공백으로 자른다.
      String[] input = request.split(" ");

      // ex) 10[0] +[1] 30[2]
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
        case "%":
          result = a % b;
          break;
        default:
          out.printf("%s 연산자를 지원하지 않습니다.\n", op);
          out.flush();
          return;
      }
      // 결과를 클라이언트로 out한다.
      out.printf("결과는 %d 입니다.\n", result);
      out.flush();
    } catch (Exception e) {
      try {
        out.println("식의 형식이 잘못되었습니다.");
        out.flush();
      } catch (Exception e2) {
      }
    }
  }

  boolean isQuit(String request) {
    if (request.equalsIgnoreCase("quit")) {
      out.println("안녕히 가세요!");
      out.flush();
      return true;
    }
    return false;
  }
}
