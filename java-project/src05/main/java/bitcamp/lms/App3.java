package bitcamp.lms;

import java.util.Date;

public class App3 {

  public static void main(String[] args) {
    java.util.Scanner keyboard = new java.util.Scanner(System.in);
    java.util.Date today= new java.util.Date();
    int a=0;
    
    System.out.print("번호? ");
    int num = keyboard.nextInt();
  
    keyboard.nextLine();
    
    System.out.print("내용? ");
    String contents = keyboard.nextLine();

    System.out.printf("번호: %d\n", num);
    System.out.printf("내용: %s\n", contents);
    System.out.printf("작성일: %1$tY-%1$tm-%1$td\n", today);
    System.out.printf("조회수: %d\n", a);
  }
}
