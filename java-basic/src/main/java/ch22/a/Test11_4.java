// java.io.File 클래스 : FileFilter 사용하기
package ch22.a;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class Test11_4 {
  
  public static void main(String[] args) throws IOException {

    // 파일은 디렉토리와 파일을 통칭하는 용어다.
    File file = new File(".");

    // lambda class
    File[] files = file.listFiles((File pathname) -> {
      if (pathname.isFile() && pathname.getName().endsWith(".txt"))
        return true;
      else
        return false;
    });

    for (File f : files) {
      System.out.printf("%s %12d %s\n", 
          f.isDirectory() ? "d" : "-", 
          f.length(), 
          f.getName());
    }
  }
}


