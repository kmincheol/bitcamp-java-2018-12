// 애노테이션
package ch28.b;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// 애노테이션 유지범위 지정하기
//
@Retention(RetentionPolicy.SOURCE)
public @interface MyAnnotation2 {

}
