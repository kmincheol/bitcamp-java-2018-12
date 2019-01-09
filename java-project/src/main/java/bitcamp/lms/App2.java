package bitcamp.lms;

import java.util.Date;

public class App2 {

  public static void main(String[] args) {
    java.util.Scanner keyboard = new java.util.Scanner(System.in);

    int index = 1;
    int indexPrint = 1;

    int[] num = new int[100];
    String[] name = new String[100];
    String[] email = new String[100];
    int[] pwd = new int[100];
    String[] pic = new String[100];
    String[] callNum = new String[100];

    Date createdDate = new Date(System.currentTimeMillis());

    while (true) {
      System.out.print("번호? ");
      num[index] = keyboard.nextInt();
      keyboard.nextLine();
      System.out.print("이름? ");
      name[index] = keyboard.nextLine();
      System.out.print("이메일? ");
      email[index] = keyboard.nextLine();
      System.out.print("암호? ");
      pwd[index] = keyboard.nextInt();
      keyboard.nextLine();
      System.out.print("사진? ");
      pic[index] = keyboard.nextLine();
      System.out.print("전화? ");
      callNum[index] = keyboard.nextLine();
      System.out.println();

      System.out.print("계속 입력하시겠습니까?(Y/n)");
      String str = keyboard.next();
      System.out.println();
      if (!str.equalsIgnoreCase("y") && !str.equalsIgnoreCase("")) {
        while (indexPrint <= index) {
          System.out.printf("%d, %s, %s, %s\n", num[indexPrint], name[indexPrint],
              callNum[indexPrint], createdDate);
          indexPrint++;
        }
        break;
      }
      index++;
    }
  }
}
