// 애노테이션 사용 범위
// => @target
package ch28.c;

@MyAnnotation // 클래스
// @MyAnnotation2 // 필드
// @MyAnnotation3 // 메서드
// @MyAnnotation4 // 로컬 변수
public class Test01 {

  // @MyAnnotation // 클래스
  @MyAnnotation2 // 필드
  // @MyAnnotation3 // 메서드
  // @MyAnnotation4 // 로컬 변수
  int i;

  // @MyAnnotation // 클래스
  @MyAnnotation2 // 필드
  // @MyAnnotation3 // 메서드
  // @MyAnnotation4 // 로컬 변수
  static int j;

  // @MyAnnotation // 클래스
  // @MyAnnotation2 // 필드
  @MyAnnotation3 // 메서드
  // @MyAnnotation4 // 로컬 변수
  public static void main(String[] args) {

    // @MyAnnotation // 클래스
    // @MyAnnotation2 // 필드
    // @MyAnnotation3 // 메서드
    @MyAnnotation4 // 로컬 변수
    int local;
  }
}
