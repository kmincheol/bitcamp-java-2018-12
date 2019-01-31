// java.io.File 클래스 : 연습과제 - bin/main 폴더를 뒤져서 모든 클래스 파일의 이름을 출력하라.
package ch22.a;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class Test14 {
  static class TextFileFilter implements FileFilter {
    @Override
    public boolean accept(File pathname) {
      if (pathname.isDirectory() || (pathname.isFile() && pathname.getName().endsWith(".class")))
        return true;
      else
        return false;
    }
  }

  public static void main(String[] args) throws IOException {

    // 클래스 이름을 출력 할 때 패키지 이름을 포함해야 한다.
    // 예) ch01.Test01
    // 예) ch22.a.Test14
    //
    File dir = new File("bin/main");

    search(dir, "");
  }

  static void search(File dir, String packageName) {

    File[] files = dir.listFiles(new TextFileFilter());

    for (File file : files) {
      if (file.isFile()) {
        System.out.printf("%s%s\n", packageName, file.getName().replace(".class", ""));
      } else {
        search(file, packageName + file.getName() + ".");
      }
    }

  }
}


