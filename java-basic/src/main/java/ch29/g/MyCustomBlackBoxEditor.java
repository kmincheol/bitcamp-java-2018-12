package ch29.g;

import java.beans.PropertyEditorSupport;

public class MyCustomBlackBoxEditor extends PropertyEditorSupport {

  @Override
  public void setAsText(String text) throws IllegalArgumentException {
    
    System.out.printf("blackBoxEditor.setAsText(%s)\n", text);
    BlackBox bb = new BlackBox();

    // , 분리
    String[] aa = text.split(",");
    bb.setMaker(aa[0]); // 비트오토
    bb.setModel(aa[1]); // 오호라박스

    this.setValue(bb);
  }
}


