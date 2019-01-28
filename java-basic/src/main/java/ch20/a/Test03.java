// java.util.ArrayList 사용법 - contains()
package ch20.a;

import java.util.ArrayList;

public class Test03 {
  public static void main(String[] args) {

    String s1 = new String("aaa");
    String s2 = new String("bbb");
    String s3 = new String("ccc");

    String s4 = new String("bbb");

    System.out.println(s2 == s4); // 주소 다름 -> false
    System.out.println(s2.equals(s4)); // 값 같음 -> true
    System.out.println(s2.hashCode()==s4.hashCode());

    System.out.println("---------------------------------------");

    ArrayList<String> list = new ArrayList<>();

    // add(value) : 목록에 순차적으로 추가한다.
    list.add(s1);
    list.add(s2);
    list.add(s3);

    System.out.println(list);

    // contains() : 
    // => 인스턴스가 다르더라도 equals()의 리턴 값이 true이고 hashCode()의 리턴 값이 같다면
    //    목록에 있는 것으로 판단한다.
    System.out.println(list.contains(s2));
    System.out.println(list.contains(s4));

  }
}
