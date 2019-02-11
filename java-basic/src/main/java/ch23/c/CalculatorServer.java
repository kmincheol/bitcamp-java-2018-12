// 계산기 서버 만들기
// 1단계 : 단순히 클라이언트 요청에 응답하기
// 2단계 : 반복문을 처리하여 계속해서 클라이언트 요청 처리하기
// 3단계 : 연산자 처리
// 4단계 : 입력값 예외처리
// 5단계 : 클라이언트에서 종료하기 전까지는 계속 연결 유지한 상태로 요청 처리하기
// 6단계 : 소스코드 리펙토링
// 7단계 : 소스코드 리펙토릭 - 클래스 분리하기
package ch23.c;

import java.net.ServerSocket;

public class CalculatorServer {
  public static void main(String[] args) {
    try (ServerSocket serverSocket = new ServerSocket(8888)) {

      System.out.println("서버 실행 중....");
      while (true) {
        try {
          new CalculatorProcessor(serverSocket.accept()).excute();;
        } catch (Exception e) {
          System.out.println("클라이언트와 통신 중에 오류 발생");
          e.printStackTrace();
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

