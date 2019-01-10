// main() 메서드의 파라미터 응용
package ch06;

public class Test14 {
  public static void main(String[] args) {
    // 합계를 출력하는 프로그램을 작성하라
    // $ java -cp ./bin/main ch06.Test14 200 42 56

    int sum = 0;
    for(String arg : args) {
      sum += Integer.parseInt(arg);
      System.out.printf("합계: %d\n", sum);
    }
    System.out.println("-----------------------");
  }
}
