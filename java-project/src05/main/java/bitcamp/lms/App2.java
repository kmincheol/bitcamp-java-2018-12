package bitcamp.lms;

import java.util.Date;

public class App2 {

  public static void main(String[] args) {
    java.util.Scanner keyboard = new java.util.Scanner(System.in);
java.util.Date today=new java.util.Date();


    System.out.print("번호? ");
    int num = keyboard.nextInt();
  
    keyboard.nextLine();
    
    System.out.print("이름? ");
    String name = keyboard.nextLine();

    System.out.print("이메일? ");
    String email = keyboard.nextLine();
    
    System.out.print("암호? ");
    int pwd = keyboard.nextInt();
    
    keyboard.nextLine();
    
    System.out.print("사진? ");
    String png = keyboard.nextLine();
    
    System.out.print("전화? ");
    String callNum = keyboard.nextLine();
    
    System.out.printf("번호: %d\n", num);
    System.out.printf("이름: %s\n", name);
    System.out.printf("이메일: %s\n", email);
    System.out.printf("암호: %d\n", pwd);
    System.out.printf("사진: %s\n", png);
    System.out.printf("전화: %s\n", callNum);
    System.out.printf("가입일: %1$tY-%1$tm-%1$td", today);
  }
}
