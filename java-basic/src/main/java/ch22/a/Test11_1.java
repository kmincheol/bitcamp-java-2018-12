// java.io.File 클래스 : FileFilter 사용하기
package ch22.a;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class Test11_1 {
  
  // static nested class
  static class TextFileFilter implements FileFilter {
    @Override
    public boolean accept(File pathname) {
      if (pathname.isFile() && pathname.getName().endsWith(".txt"))
        return true;
      else
        return false;
    }
  }
  
  public static void main(String[] args) throws IOException {

    // 파일은 디렉토리와 파일을 통칭하는 용어다.
    File file = new File(".");

    // 하위 파일이나 디렉토리의 상세정보 알아내기
    File[] files = file.listFiles(new TextFileFilter());
    
    for (File f : files) {
      System.out.printf("%s %12d %s\n", 
          f.isDirectory() ? "d" : "-", 
          f.length(), 
          f.getName());
    }
  }
}


