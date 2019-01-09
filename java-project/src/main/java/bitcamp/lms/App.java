package bitcamp.lms;

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardUpLeftHandler;

public class App {

  public static void main(String[] args) {
    java.util.Scanner keyboard = new java.util.Scanner(System.in);

    int index = 0;
    int indexprint = 0;

    int[] num = new int[100];
    String[] className = new String[100];
    String[] classContents = new String[100];
    String[] starDate = new String[100];
    String[] endDate = new String[100];
    int[] totalDate = new int[100];
    int[] totalDay = new int[100];

    while (true) {
      System.out.print("번호? ");
      num[index] = keyboard.nextInt();

      keyboard.nextLine();

      System.out.print("수업명? ");
      className[index] = keyboard.nextLine();

      System.out.print("수업내용? ");
      classContents[index] = keyboard.nextLine();

      System.out.print("시작일? ");
      starDate[index] = keyboard.nextLine();

      System.out.print("종료일? ");
      endDate[index] = keyboard.nextLine();

      System.out.print("총수업시간? ");
      totalDate[index] = keyboard.nextInt();

      System.out.print("일수업시간? ");
      totalDay[index] = keyboard.nextInt();

      keyboard.nextLine();

      System.out.print("계속 입력하시겠습니까?(Y/n)");
      String str = keyboard.nextLine();

      if (!str.equalsIgnoreCase("y") && !str.equals("")) {
        while (indexprint <= index) {
          System.out.printf("%d, %-10s, %s ~ %s, %4d\n", num[indexprint], className[indexprint],
              starDate[indexprint], endDate[indexprint], totalDate[indexprint]);
          indexprint++;
        }
        break;
      }
      index++;
    }
  }
}

