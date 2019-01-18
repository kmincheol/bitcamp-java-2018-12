package com.eomcs.lms.handler;

import java.util.Arrays;
import com.eomcs.lms.domain.Lesson;

public class LessonList {
  static final int LENGTH = 10;
  Lesson[] arr = new Lesson[LENGTH];
  int size = 0;

  public Lesson[] toArray() {
    Lesson[] a = new Lesson[size];
    for (int i = 0; i < size; i++) {
      a[i] = this.arr[i];
    }
    return a;
  }

  public void add(Lesson lesson) {
    if (size < arr.length) {
      arr = Arrays.copyOf(arr, arr.length + (arr.length >> 1));
    }
    arr[size++] = lesson;
  }
}
