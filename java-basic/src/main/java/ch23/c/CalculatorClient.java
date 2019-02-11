// 계산기 클라이언트 만들기  
// 실행 : java - cp bin/main ch23.c.CalculatorClient
// 1단계 - 단순히 서버에 요청하고 응답을 받아 출력한다.
// 2단계 - 키보드에서 입력 받은 값을 서버에 보낸다.
// 5단계 - 사용자가 quit을 입력하기 전까지 계속 서버와 연결된 상태로 있기
package ch23.c;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/*
구현 조건 :
- 최소 +, -, *, /, % 연산자는 지원한다.
실행 예:
- 클라이언트가 계산기 서버에 접속한 후

계산기 서버에 오신걸 환영합니다! <== 서버의 응답
계산식을 입력하세요! <== 서버의 응답
예) 23 + 7 <== 서버의 응답
> 23 + 7 <== 사용자의 입력. '>' 문자는 클라이언트에서 출력한다.
결과는 30 입니다. <== 서버의 응답
> 23 ^ 7 <== 사용자의 입력. 
^ 연산자를 지원하지 않습니다. <== 서버의 응답
> ok + yes <== 사용자의 입력. 
식의 형식이 잘못되었습니다. <== 서버의 응답 
>quit <== 사용자의 입력. 
안녕히 가세요! <== 서버의 응답

 */
public class CalculatorClient {
  public static void main(String[] args) {
    try (Scanner keyboard = new Scanner(System.in);
        Socket socket = new Socket("localhost", 8888);
        PrintStream out = new PrintStream(socket.getOutputStream());
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

      while (true) {
        String input = in.readLine();
        System.out.println(input);
        if (input.length() == 0)
          break;
      }
      
      while (true) {
        // 꺽쇠와 공백을 출력하고 한줄을 입력한다.
        System.out.print("> ");
        String input = keyboard.nextLine();

        out.println(input);
        out.flush();

        // 서버로부터 한 줄을 읽어서 출력한다.
        String reponse = in.readLine();
        System.out.println(reponse);

        if (input.equalsIgnoreCase("quit"))
          break;
      }

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}


