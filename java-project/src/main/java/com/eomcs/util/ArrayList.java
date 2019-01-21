package com.eomcs.util;

import java.util.Arrays;
import com.eomcs.lms.domain.Board;

public class ArrayList<E> {
  static final int DEFAULT_CAPACITY = 10;
  Object[] list;
  int size = 0;

  public ArrayList() {
    list = new Object[DEFAULT_CAPACITY];
  }

  public ArrayList(E[] arr, int initialCapacity) {
    if (initialCapacity > DEFAULT_CAPACITY)
      list = new Object[DEFAULT_CAPACITY];
    else
      list = new Object[DEFAULT_CAPACITY];
  }

  @SuppressWarnings("unchecked")
  public E[] toArray(E[] sampleArr) {
    return (E[]) Arrays.copyOf(list, size, sampleArr.getClass());
    /*
     * E[] arr = Arrays.copyOf(sampleArr, size); for (int i = 0; i < size; i++) { arr[i] = (E)
     * list[i]; } return arr;
     */
  }

  public void add(E obj) {
    if (size >= list.length) {
      int oldCapacity = list.length;
      int newCapacity = oldCapacity + (oldCapacity >> 1);
      list = Arrays.copyOf(list, newCapacity);
    }

    list[size++] = obj;
  }

  @SuppressWarnings("unchecked")
  public E get(int index) {
    // index : 값을 꺼낼 배열의 항목 위치
    if (index < 0 || index >= size)
      return null;
    return (E) list[index];
  }

  @SuppressWarnings("unchecked")
  public E set(int index, E value) {
    // index : 값을 변경할 배열의 항목 위치
    // value : 해당 위치에 있는 값을 대체할 값
    // 리턴 값 : 대체되기 전의 기존 값
    if (index < 0 || index >= size)
      return null;

    E obj = (E) list[index];
    list[index] = value;
    return obj;
  }

  @SuppressWarnings("unchecked")
  public E remove(int index) {
    // index : 삭제할 배열의 항목 위치
    // 리턴값 : 삭제된 이전 값
    // 힌트 : System.arraycopy() 참고
    if (index < 0 || index >= size)
      return null;

    E obj = (E) list[index];
    for (int i = index; i < size - 1; i++) {
      list[i] = list[i + 1];
      size--;
    }
    return obj;
  }

  public int size() {
    return this.size;
  }
}


