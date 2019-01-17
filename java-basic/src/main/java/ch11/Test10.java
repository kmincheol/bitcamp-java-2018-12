// Wrapper 클래스와 오토박싱(auto-boxing)/오토언박싱(auto-unboxing)
package ch11;

public class Test10 {
  public static void main(String[] args) {
    // primitive type의 값을 인스턴스에 담고("박싱;boxing")이라 부른다
    // 인스턴스에 담긴 primitive 값을 다시 꺼내는 작업(언박싱;unboxing"이라 부른다)이 매우 불편하다.
    
    Integer obj1 = Integer.valueOf(100); // 박싱
    int i1 = obj1.intValue(); // 언박싱

    // 그래서 자바는 boxing과 unboxing을 코드 문맥에 따라 자동으로 수행한다.
    int i2 = obj1; // 오토 언박싱. 즉 내부적으로 obj1.intValue()를 호출한다.
    Integer obj2 = 200; // 오토 박싱. 즉 내부적으로 Integer.valueOf(200)을 호출한다.
    
  }
}
