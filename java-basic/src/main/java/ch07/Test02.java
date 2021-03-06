// 클래스 사용 전 II
package ch07;

public class Test02 {
  public static void main(String[] args) {
    // 학생 정보를 출력하는 명령어를 별도의 블록으로 뺐다.
    // 성적을 출력하는 명령어를 별도의 블록으로 빼는 이유는 유지보수를 쉽게 하기 위함이다.
    // 출력 형식을 바꾸고 싶으면 그 블록으로 가서 변경하면 된다.
    // 그런데 출력 명령을 별도로 빼면 그 명령어 블록을 실행하기 위해서는 성적 값을 전달해야 한다.
    // 즉 파라미터를 선언해야 한다.
    //

    String name = "홍길동";
    int kor = 100;
    int eng = 100;
    int math = 100;

    // 별도로 뺀 명령어 블록(메서드)를 사용해(호출)보자!
    printScore(name, kor, eng, math);
    // 과목이 많다면 메서드의 파라미터가 많아지고, 메서드 선언할 때 복잡해진다.
    // 따라서 성적 데이터를 한 공간에 넣어야 한다.
    // 자바는 모든 경우를 고려해서 다양한 종류의 값을 담을 수 있는 변수를 제공하지는 않는다.
    // 대신 여러 종류의 데이터를 묶어 새로운 형태의 데이터 타입을 만들 수 있는 문법을 제공한다.
    // 그 문법의 이름이 "클래스" 이다.!!!!!!!!!!!!!!!
    // 클래스란? 개발자가 자신이 개발하는 프로그램에서 사용할 특별한 형식의 데이터를 다룰 수 있는
    // 새로운 데이터 타입을 정의하게 해주는 문법이다.
    // 즉 byte, short, int, long, float, double, boolean, char 외에
    // 새 형식의 새로운 메모리 구조를 갖는 데이터 타입을 정의할 수 있다.
    // 이렇게 정의한 새 데이터 타입을 "사용자 정의 데이터 타입(user defined data type)"이라 한다.
    //
  }

  static void printScore(String name, int kor, int eng, int math) {
    int sum = kor + eng + math;
    float avg = sum / 3f;
    System.out.printf("%s: %d, %d, %d, %d, %f\n", name, kor, eng, math, sum, avg);
  }
}

/*
# 클래스 문법의 활용
1) 사용자 정의 데이터 타입과 그 타입의 값을 다루는 연산자를 정의할 때 사용한다.
2) 서로 관련된 일을 하는 메서드를 관리하기 쉽게 분류하여 묶는 용도로 사용한다.
 */







