package ch12.c.other;

import ch12.c.My;

public class Test02 {
  public static void main(String[] args) {
    My obj1 = new My();

    // private
    // obj1.v1=100; // 접근 불가

    // default
    // obj1.v2 = 100; // 서로 다른 패키지라서 접근 불가능

    // protected
    // obj1.v3 = 100; // 접근 불가

    // public 접근 가능
    obj1.v4 = 100; // ok! 완전 공개이다.
  }
}
