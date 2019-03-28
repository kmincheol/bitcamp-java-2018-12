package design_pattern.chain_of_responsibility;

import java.util.Scanner;

public class Test01 {
  @SuppressWarnings("resource")
  public static void main(String[] args) {
    Scanner k = new Scanner(System.in);
    // 마지막 객체 아무 수행 능력 없음.
    TerminalHandler terminalHandler = new TerminalHandler();

    PlusHandler plusHandler = new PlusHandler();
    plusHandler.setNext(terminalHandler);

    // - 연산을 처리하고 싶다면 그 작업을 수행하는 객체를 만들어 체인에 연결하라!
    MinusHandler minusHandler = new MinusHandler();
    minusHandler.setNext(plusHandler);

    // * 연산을 처리하고 싶다면 그 작업을 수행하는 객체를 만들어 체인에 연결하라!
    MutipleHandler mutipleHandler = new MutipleHandler();
    mutipleHandler.setNext(minusHandler);

    // 이렇게 기능을 체인으로 엮어 가는 설계 기법을 Chain of Responsibility 라 부른다.

    while (true) {
      System.out.print("a? ");
      int a = k.nextInt();

      System.out.print("b? ");
      int b = k.nextInt();

      System.out.print("op? ");
      String op = k.next();

      mutipleHandler.handle(a, b, op);
    }
  }
}
