// Wrapper 클래스와 오토박싱(auto-boxing)
package ch11;

public class Test09 {
  public static void main(String[] args) {
    // 자바는 primitive type의 각각에 대응하는 클래스를 제공한다.
    // 자바 원시 타입의 각각에 대응하는 클래스를 제공한다.
    // 이 클래스를 "Weapper 클래스"라 ("부른다"


    // Wrapper 클래스의 생성자가 deprecaed 상태이다.
    // 가능한 생성자를 사용하여 인스턴스를 생성하지 말라!
    // deprecated(비난받는)? 사용하지 않는 것이 좋다고 결정되었고, 가까운 장래에 제거된 것이라는 의미.

    // Integer i1 = new Integer(100); // 가능한 사용하지 말자!
    Integer i1 = Integer.valueOf(100); // OK!

    // char c = new Character('가');
    Character c1 = Character.valueOf('가');

    // Wrapper 클래스는 해당 값을 다루는 다양한 메서드를 제공한다.
    byte b = i1.byteValue(); // int byte로 변환하여 리턴하는 메서드
    String s = i1.toString(); // int를 String 인스턴스로 리턴하는 메서드
    String str = Integer.toHexString(200); // int 값을 16진수로 변환한 후 문자열로 리턴

    // Wrapper 클래스의 가장 큰 목적!
    // => primitive 값을 포함하여 모든 값을 쉽게 주고 받기 위함이다.

    // Wrapper 클래스를 사용하지 않으면 다음과 같이 각 타입의 값을 처리할 메서드를
    // 여러 개 만드들어야 한다.
    printInt(100);
    printFloat(3.14f);
    // printInt("Hello") // 컴파일 오류!
    // primitive 데이터를 다루는 메서드를 여러 개 만들 필요가 없다.

  }
  static void printInt(int i) {
    System.out.printf("값 => %f, f");
  static void printFloat(float f) {
    System.out.printf("값 => %f, f");
  }
}
