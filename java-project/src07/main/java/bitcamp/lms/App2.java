package bitcamp.lms;

import java.util.Date;

public class App2 {

  public static void main(String[] args) {
    java.util.Scanner keyboard = new java.util.Scanner(System.in);
    Date createdDate = new Date(System.currentTimeMillis());

    int index = 0;
    int indexPrint = 0;

    Member[] memberData = new Member[10]; // 레퍼런스생성
    for (; index < memberData.length; index++) {
      memberData[index] = new Member(); // 인스턴스 생성
      
      System.out.print("번호? ");
      memberData[index].num = keyboard.nextInt();

      keyboard.nextLine();

      System.out.print("이름? ");
      memberData[index].name = keyboard.nextLine();

      System.out.print("이메일? ");
      memberData[index].email = keyboard.nextLine();

      System.out.print("암호? ");
      memberData[index].pwd = keyboard.nextInt();

      keyboard.nextLine();

      System.out.print("사진? ");
      memberData[index].pic = keyboard.nextLine();

      System.out.print("전화? ");
      memberData[index].callNum = keyboard.nextLine();

      System.out.println();

      System.out.print("계속 입력하시겠습니까?(Y/n)");
      String str = keyboard.nextLine();
      
      System.out.println();
      
      if (!str.equalsIgnoreCase("y") && !str.equalsIgnoreCase("")) {
        while (indexPrint <= index) {
          System.out.printf("%d, %s, %s, %s\n", memberData[indexPrint].num,
              memberData[indexPrint].name, memberData[indexPrint].callNum, createdDate);
          indexPrint++;
        }
        break;
      }
    }
  }
}
