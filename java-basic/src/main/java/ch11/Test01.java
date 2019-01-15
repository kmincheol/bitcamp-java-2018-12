// 생성자 활용 - String 클래스의 생성자 활용
package ch11;

public class Test01 {
  public static void main(String[] args) throws Exception{
    // String 인스턴스 생성
    String s1 = new String();
    // => 내부적으로 문자의 코드 값을 저장할 char 배열(버전 1.8 까지)
    //    또는 byte 배열(버전 1.9 부터)을 생성한다.
    // => 생성자에서 넘겨주는 값을 배열에 저장한다.
    // => 만약 생성자에 아무것도 넘겨주지 않으면 빈 배열이 생성된다.
    
    System.out.println(s1); // 빈 문자열 출력
    String s2 = new String("Hello"); // 문자열 리터럴로 String 인스턴스 생성
    
    char[] chars = {'H', 'e', 'l', 'l', 'o'};
    String s3 = new String(chars); // char 배열로 String 인스턴스 생성
    
    byte[] bytes = {(byte)0xb0, (byte)0xa1, (byte)0xb0, 
        (byte)0xa2, 0x30, 0x31, 0x32, 0x41, 0x42, 0x43};
    // 문자 코드 값이 저장된 바이트 배열로 String 인스턴스 생성
    String s4 = new String(bytes);
    // 한글이 깨진다. 이유?
    // => String 생성자는 파라미터로 받은 바이트 배열에 ISO-8859-1 문자 코드가 들어 있다고 간주한다.
    //      즉 0xb0 0xa1 값이 한글 '가'가 아니라 0xb0와 0xa1 각각을 영어라 간주하고
    //    ISO-8859-1 에 정의된 문자표에 따라 화면에 출력한다.
    //    Oxb0에 해당하는 문자가 출력되는 것이다.
    // => 제대로 한글을 처리하려면? 생성자에 바이트 배열을 넘겨줄 때 배열에 들어 있는 코드 값이
    //    어떤 문자표의 코드 값인지 알려줘야 한다.
    //

    String s5 = new String(bytes, "euc-kr");
        
        
    System.out.println(s2);
    System.out.println(s3);
    System.out.println(s4);
    System.out.println(s5);
    }
  }
