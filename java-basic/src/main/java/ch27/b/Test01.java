// 클리스(또는 인스턴스) 이름 알아내기
package ch27.b;

public class Test01 {
  public static void main(String[] args)throws Exception{
    Class<?> clazz=Calculator.class;
    
    System.out.println(clazz.getName());
    System.out.println(clazz.getCanonicalName());
    System.out.println(clazz.getSimpleName());
  }

}
