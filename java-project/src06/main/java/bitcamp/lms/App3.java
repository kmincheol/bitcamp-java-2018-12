package bitcamp.lms;

import java.util.Date;

public class App3 {

  public static void main(String[] args) {
    java.util.Scanner keyboard = new java.util.Scanner(System.in);
    Date createdDate = new Date(System.currentTimeMillis());

    int index = 1;
    int indexPrint = 1;

    int[] num = new int[20];
    String[] contents = new String[20];

    while (true) {
      System.out.print("번호? ");
      num[index] = keyboard.nextInt();

      keyboard.nextLine();

      System.out.print("내용? ");
      contents[index] = keyboard.nextLine();

      System.out.println();

      System.out.print("계속 입력하시겠습니까?(Y/n)");
      String str = keyboard.next();
      System.out.println();

      if (!str.equalsIgnoreCase("y") && !str.equalsIgnoreCase(""))
        break;

      index++;
    }

    while (indexPrint <= index) {
      System.out.printf("%d, %s, %s\n", num[indexPrint], contents[indexPrint], createdDate);
      indexPrint++;
    }
  }
}
