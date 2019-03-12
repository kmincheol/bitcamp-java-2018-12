// reflection API : 메서드의 상세 정보 꺼내기
package ch27.b;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

public class Test05 {
  public static void main(String[] args) throws Exception {

    Class<?> clazz = String.class;

    Method[] methods = clazz.getDeclaredMethods();
    for (Method m : methods) {
      System.out.printf("메서드명 : %s\n", m.getName());

      System.out.printf("파라미터: %d\n", m.getParameterCount());

      Parameter[] params = m.getParameters();
      for (Parameter p : params) {
        // (파라미터명, 파라미터 타입명)
        System.out.printf("    %s:%s\n", p.getName(), p.getType());
      }

      System.out.println("리턴 타입:");
      System.out.printf("    %s\n", m.getReturnType().getName());
      
      System.out.println("접근 제어:");
      int modifiers = m.getModifiers();
      System.out.printf("public: %b\n", (modifiers & Modifier.PUBLIC) == (Modifier.PUBLIC));

      System.out.println("-----------------------------");
    }
  }
}
