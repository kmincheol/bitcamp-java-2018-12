package com.eomcs.lms.handler;

import java.util.Arrays;
import com.eomcs.lms.domain.Board;

public class BoardList {

  static final int LENGTH = 10;
  Board[] arr = new Board[LENGTH];
  int size = 0;

  public Board[] toArray() { // 배열 사이즈 만큼 주소 복사
    Board[] a = new Board[size];
    for (int i = 0; i < size; i++) {
      a[i] = this.arr[i];
    }
    return a;
  }

  public void add(Board board) {
    // 배열 사이즈를 넘어 추가한다면
    if (size == arr.length) {
      arr = Arrays.copyOf(arr, arr.length + (arr.length >> 1));

      // // arr 현재 배열 길이에 50%씩 추가해서 만들어라 ( >> 1 비트이동)
      // Board[] a = new Board[arr.length + (arr.length >> 1)];
      // // 새로운 배열의 주소를 담는다
      // for(int i=0; i<arr.length; i++) {
      // a[i]=arr[i];
      // }
      // arr = a;
    }
    arr[size++] = board;
  }
}
