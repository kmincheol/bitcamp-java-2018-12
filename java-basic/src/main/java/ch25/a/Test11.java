// java.sql.Statement - delete 실행하기
package ch25.a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test11 {
  public static void main(String[] args) {
    try (Connection con = DriverManager
        .getConnection("jdbc:mariadb://localhost/bitcampdb?user=bitcamp&password=1111")) {
      System.out.println("DBMS 연결됨");

      // Connection 객체를 통해 SQL을 DBMS에 전달할 때 사용할 도구를 얻는다.
      // => java.sql.Statement 구현체이다.
      try (Statement stmt = con.createStatement()) {

        // delete 문장은 executeUpdate()를 사용하여 서버에 전달한다.
        int count = stmt
            .executeUpdate("delete from x_board where board_id > 5");
        // 리턴 값은 delete 한 레코드의 개수이다
        System.out.println(count);
      }
    } catch (Exception e) {
      System.out.println("DBMS에 연결 중 오류 발생!");
      e.printStackTrace();
    }
  }
}


