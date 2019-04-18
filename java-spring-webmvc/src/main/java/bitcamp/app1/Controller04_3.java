// 요청 핸들러의 파라미터 - @RequestParam
package bitcamp.app1;

import java.io.PrintWriter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/c04_3")
public class Controller04_3 {

  // 클라이언트가 보낸 파라미터 값을 바로 받을 수 있다.

  // => 요청 핸들러의 아규먼트로 선언하면 된다.
  // 단 파라미터 앞에 @RequestParam 애노테이션을 붙인다.
  // 그리고 클라이언트가 보낸 파라미터 이름을 지정한다.
  // 테스트:
  // http://localhost:8080/java-spring-webmvc/app1/c04_2/h1?name=kim
  @GetMapping("h1")
  @ResponseBody
  public void handler1(
      PrintWriter out, 
      String model, 
      String maker, 
      int capacity, 
      boolean auto,
      Car car) {
    // 프론트컨트롤러가 자동으로 스트링을 인트로 바꿔준다.
    out.printf("model=%s\n", model);
    out.printf("maker=%s\n", maker);
    out.printf("capacity=%s\n", capacity);
    out.printf("auto=%s\n", auto);
    out.printf("auto=%s\n", car);
  }
}

