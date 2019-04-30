package ch01;

// 자바 패키지 - 패키지 무소속 클래스
public class Test001 {
  public static void main(String[] args) {
    int num = 10;
    for (int i = 0; i < num; i++) {
      for (int j = 1; j < num - i; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < i * 2 + 1; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}

/*
 * # 패키지 무소속 클래스 - 특정 패키지에 소속이 되지 않은 클래스이다. - 실행할 때 클래스 이름만 지정하면 된다.
 * 
 * $ java -cp bin Test001
 * 
 * - Test01 은 비록 ch01 폴더에 있지만 패키지에 소속되지 않은 클래스이다. - 패키지에 소속시키려면 명령어를 추가해야 한다.
 * 
 * # 패키지 소속 클래스 - 특정 패키지에 소속된 클래스이다. - 실행할 때 반드시 패키지 이름을 지정해야 한다. $ java -cp bin ch01.Test02
 * 
 * 
 * 
 */
