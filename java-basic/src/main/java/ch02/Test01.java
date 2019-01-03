// 리터럴(literal) - 자바 언어로 표현한 값
package ch02;

public class Test01 {
  public static void main(String[] args) {
    System.out.println("Hello!");
    // 1)정수 78을 출력하라
    // => 10진수
    System.out.println(78);
    // => 8진수
    System.out.println(0116);
    // => 16진수
    System.out.println(0x4E);
    // => 2진수
    System.out.println(0b1001110);

    // 2) 부동소수점을 출력하라.
    // => 12.345
    System.out.println(12.345);
    // => 1.2345 를 출력할 때 12.345가 나오게 하라
    System.out.println(1.2345E1);
    // => 0.12345 를 출력할 때 12.345가 나오세 하라
    System.out.println(0.12345e2);
    // => 123.45 를 출력할 때 12.345가 나오세 하라
    System.out.println(123.45e-1);

    // 3) 논리값을 출력하라
    // => 참 을 출력하라
    System.out.println(true);
    // => 거짓 을 출력하라
    System.out.println(false);

    // 4) 문자를 출력하라
    // => 0x61 값을 출력했을 때 a가 나오게 하라
    System.out.println((char)0x61);
    //=>97 값을 출력했을 때 a가 나오게 하라
    System.out.println((char)97);
    // =>작은 따옴표를 사용하여 a를 출력하라
    System.out.println('a');
// 리터럴
package ch02;

public class Test02 {
  public static void main(String[] args) {
    System.out.println("Hello!");
    // 20 억을 4바이트 리터럴로 출력하라
    System.out.println(2000000000);
    // 20 억을 8바이트 리터럴로 출력하라
    System.out.println(2000000000L);
    // 30 억을 8바이트 리터럴로 출력하라
    System.out.println(3000000000L);
    // 30 억을 4바이트 리터럴로 출력하라
    //    System.out.println(3000000000);   //컴파일오류! 범위 벗어남.
// 리터럴
package ch02;

public class Test02 {
  public static void main(String[] args) {
    System.out.println("Hello!");
    // 20 억을 4바이트 리터럴로 출력하라
    System.out.println(2000000000);
    // 20 억을 8바이트 리터럴로 출력하라
    System.out.println(2000000000L);
    // 30 억을 8바이트 리터럴로 출력하라
    System.out.println(3000000000L);
    // 30 억을 4바이트 리터럴로 출력하라
    //    System.out.println(3000000000);   //컴파일오류! 범위 벗어남.

  }
}

/*
# 메모리 크기
1 비트: 0, 1
2 비트: 
  - 음수가 없는 경우: 00(0), 01(1), 10(2), 11(3) (0 ~ 3)
  - 음수가 있는 경우: 00(0), 01(1), 10(-2), 11(-1) (-2 ~ 1)
4 비트: 2^4 = 0 ~ 2^4 - 1 = -2^3 ~ 2^3 - 1
8 비트: 2^8 = 0 ~ 2^8 - 1 = -2^7 ~ 2^7 - 1 = -128 ~ 127
16 비트: 2^16 = 0 ~ 2^16 - 1 = -2^15 ~ 2^15 - 1 = -32768 ~ 32767

# 4바이트 정수 리터럴
100

# 8바이트 정수 리터럴
정수 뒤에 접미사 L 또는 l을 붙인다.
100L (주로 사용)
100l
 */
  }
}

/*
# 메모리 크기
1 비트: 0, 1
2 비트: 
  - 음수가 없는 경우: 00(0), 01(1), 10(2), 11(3) (0 ~ 3)
  - 음수가 있는 경우: 00(0), 01(1), 10(-2), 11(-1) (-2 ~ 1)
4 비트: 2^4 = 0 ~ 2^4 - 1 = -2^3 ~ 2^3 - 1
8 비트: 2^8 = 0 ~ 2^8 - 1 = -2^7 ~ 2^7 - 1 = -128 ~ 127
16 비트: 2^16 = 0 ~ 2^16 - 1 = -2^15 ~ 2^15 - 1 = -32768 ~ 32767

# 4바이트 정수 리터럴
100

# 8바이트 정수 리터럴
정수 뒤에 접미사 L 또는 l을 붙인다.
100L (주로 사용)
100l
 */
    // =>5)문자열을 출력하라.
    // =>Hello라는 문자열을 출력하라
    System.out.println("Hello");
    // =>안녕하세요 문자열을 출력하라
    System.out.println("안녕하세요");
  }
}

/*
# 리터럴
정수(integer)
  100 (10진수)
  0144 (8진수)
  0x64, 0X64 (/*
# 리터럴
정수(integer)
  100 (10진수)
  0144 (8진수)
  0x64, 0X64 (16진수)
  0b01100100, 0B01100100 (2진수; binary)  
부동소수점(floating point)
  3.14
  31.4E-1
  314E-2
  0.314E1
  0.0314E2
논리
  true
  false
문자(결국 숫자로 표현한다)
  (char)0x41
  (char)65
  'A'
문자열
  "ABC"
  "가각간"
메모리 주소(레퍼런스; reference)
  자바에서는 임의의 메모리 주소를 표현할 방법이 없다.
  new 명령으로 메모리를 주소를 리턴 받아야 한다.

# 콘솔로 출력하는 명령어
  System.out.println(값);
 */
16진수)
  0b01100100, 0B01100100 (2진수; binary)  
부동소수점(floating point)
  3.14
  31.4E-1
  314E-2
  0.314E1
  0.0314E2
논리
  true
  false
문자(결국 숫자로 표현한다)
  (char)0x41
  (char)65
  'A'
문자열
  "ABC"
  "가각간"
메모리 주소(레퍼런스; reference)
  자바에서는 임의의 메모리 주소를 표현할 방법이 없다.
  new 명령으로 메모리를 주소를 리턴 받아야 한다.

# 콘솔로 출력하는 명령어
  System.out.println(값);
 */


/*
# 패키지 무소속 클래스
- 특정 패키지에 소속이 되지 않은 클래스이다.
- 실행할 때 클래스 이름만 지정하면 된다.

  $ java -cp bin Test01

- Test01 은 비록 ch01 폴더에 있지만 패키지에 소속되지 않은 클래스이다.
- 패키지에 소속시키려면 명령어를 추가해야 한다.

# 패키지 소속 클래스
- 특정 패키지에 소속된 클래스이다.
- 실행할 때 반드시 패키지 이름을 지정해야 한다.
  $ java -cp bin ch01.Test02
 */