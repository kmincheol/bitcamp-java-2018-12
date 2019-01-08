package bitcamp.lms;

public class App {

  public static void main(String[] args) {

    // 키보드 입력 스트림(system.in)을 스캐너 객체에 연결한다.
    // => 스캐너는 입력 스트림으로 들어온 문자열을 줄 단위로 잘라주는 역할을 수행한다.
    java.util.Scanner keyboard = new java.util.Scanner(System.in);

    // 콘솔에서 입력 받은 값을 변수에 저장한다.
    System.out.print("번호? ");
    int num = keyboard.nextInt();
    keyboard.nextLine();
    System.out.print("수업명? ");
    String className = keyboard.nextLine();
    System.out.print("수업내용? ");
    String classContents = keyboard.nextLine();
    System.out.print("시작일? ");
    String starDate = keyboard.nextLine();
    keyboard.nextLine();
    System.out.print("종료일? ");
    String endDate = keyboard.nextLine();
    System.out.print("총수업시간? ");
    int totalDate = keyboard.nextInt();
    System.out.print("일수업시간? ");
    int totalDay = keyboard.nextInt();
    keyboard.close();

    System.out.printf("번호: %d\n", num);
    System.out.printf("수업명: %s\n", className);
    System.out.printf("수업내용: %s\n", classContents);
    System.out.printf("기간: %s ~ %s\n", starDate, endDate);
    System.out.printf("총수업시간: %s 시간\n", totalDate);
    System.out.printf("일수업시간?: %s 시간\n", totalDay);
  }
}
