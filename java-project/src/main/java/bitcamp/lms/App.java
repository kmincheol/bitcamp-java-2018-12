package bitcamp.lms;

public class App {

  public static void main(String[] args) {
    java.util.Scanner keyboard = new java.util.Scanner(System.in);

    System.out.print("수업명? ");
    String className = keyboard.nextInt();

    System.out.print("이름? ");
    String name= keyboard.next();

    System.out.printf("%d(%s)\n", age, name);
  }
}
