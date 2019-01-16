package ch12.c;

public class My {
  // private : 내부 멤버
  private int v1;
  
  //(default) : 내부멤버 + 같은 패키지 소속
  int v2; // default
  
  //protected : 내부멤버 + 같은 패키지 소속 + (상속 받은 필드인 경우) 서브 클래스
  protected int v3;
  
  //publid : 전체
  public int v4;
  
  public void m1() {
    this.v1=100; // private는 내부 맴버만이 접근 가능
  }
}
