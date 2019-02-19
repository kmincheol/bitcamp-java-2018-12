// 스레드 정의하기 - Thread를 상속 받을시
package ch24.c;

public class Test03 {
  static class MyThread extends Thread {
    @Override
    public void run() {
      for (int i = 0; i < 1000; i++) {
        System.out.printf("스레드 ===> %d\n", i);
      }
    }
  }

  static class MyWork implements Runnable {
    @Override
    public void run() {
      for (int i = 0; i < 2000; i++) {
        System.out.printf("MyWork >>>>> %d\n", i);
      }
    }
  }

  public static void main(String[] args) throws InterruptedException {

    MyThread m1 = new MyThread();
    m1.start(); // run() 메서드를 호출한 후 즉시 리턴한다. 비동기로 동작한다.
    MyWork w = new MyWork();
    Thread t2 = new Thread(w);
    t2.start(); // 생성자에 넘겨준 MyWork의 run() 메서드를 호출한 후 즉시 리턴한다. 비동기로 동작한다.
    for (int i = 0; i < 2000; i++) {
      System.out.printf("main ~~~> %d\n", i);
    }
  }
}
