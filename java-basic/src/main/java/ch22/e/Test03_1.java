// 인스턴스 출력하기 - 컬렉션 API 사용
package ch22.e;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class Test03_1 {
  public static void main(String[] args) {

    // 다음 세 학생의 성적 정보를 score.data 파일에 바이너리 형식으로 저장하라.
    // OUTPUTSTREAM
    // DATAOUTPUTSTREAM
    
    ArrayList<Score> students = new ArrayList<>();
    students.add(new Score("홍길동", 100, 100, 100));
    students.add(new Score("임꺽정", 90, 90, 90));
    students.add(new Score("유관순", 80, 80, 80));
    
    try (DataOutputStream out = 
        new DataOutputStream(
            new BufferedOutputStream(
                new FileOutputStream("score.data")))) {

      out.writeInt(students.size());
      // 배열 몇 개를 출력하겠다. 라고 알려줌
      for(Score s : students) {
        out.writeUTF(s.getName());
        out.writeInt(s.getKor());
        out.writeInt(s.getEng());
        out.writeInt(s.getMath());
      }
      
      out.flush();
      
      System.out.println("데이터 쓰는중...");

      

    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("출력완료");
  }
}
