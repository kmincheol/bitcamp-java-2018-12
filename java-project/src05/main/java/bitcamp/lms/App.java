package bitcamp.lms;

public class App {

  public static void main(String[] args) {
    java.util.Scanner keyboard = new java.util.Scanner(System.in);

    System.out.print("번호? ");
    int num = keyboard.nextInt();
  
    keyboard.nextLine();
    
    System.out.print("수업명? ");
    String className = keyboard.nextLine();

    System.out.print("수업내용? ");
    String classContents = keyboard.nextLine();
    
    System.out.print("시작일? ");
    String starDate = keyboard.nextLine();
    
    System.out.print("종료일? ");
    String endDate = keyboard.nextLine();
    
    System.out.print("총수업시간? ");
    int all = keyboard.nextInt();
    
    System.out.print("일수업시간? ");
    int allD = keyboard.nextInt();

    System.out.printf("번호: %d\n", num);
    System.out.printf("수업명: %s\n", className);
    System.out.printf("수업내용: %s\n", classContents);
    System.out.printf("기간: %s ~ %s\n", starDate, endDate);
    System.out.printf("총수업시간: %s 시간\n", all);
    System.out.printf("일수업시간: %s 시간\n", allD);
  }
}
