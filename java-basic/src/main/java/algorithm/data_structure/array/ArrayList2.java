package algorithm.data_structure.array;

import java.util.Arrays;

public class ArrayList2 {
  static final int DEFAULT_SIZE = 5;

  Object[] arr;
  int size;

  public ArrayList2() {
    this(0);
  }

  public ArrayList2(int capacity) {
    if (capacity > DEFAULT_SIZE)
      arr = new Object[capacity];
    else
      arr = new Object[DEFAULT_SIZE];
  }

  public Object[] toArray() {
    // 데이터 개수 만큼 배열을 만들고 값을 복사하여 리턴.
    Object[] list = new Object[this.size];
    for(int i=0; i<size; i++) {
      list[i]=arr[i];
    }
    return list;
  }

  public void add(Object value) {
    // 현재 배열이 꽉 찼다면 현재 배열 크기의 50% 만큼 증가시켜라
    if (size >= arr.length) {
      int before = arr.length;
      int after = before + (before >> 1);
      Object[] temp = new Object[after];
      for (int i = 0; i < arr.length; i++) {
        temp[i] = arr[i];
      }
      arr = temp;
    }
  }

  public int insert(int index, Object value) {
    // 현재 배열이 꽉 찼다면 현재 배열 크기의 50% 만큼 증가시켜라
    // 유효 인덱스(현재 배열에 데이터가 저장된 방 번호)가 아니면 저장하지 말라
    // 삽입할 위치의 항목부터 이후의 항목들을 뒤로 민다.
    if (size >= arr.length) {
      int before = arr.length;
      int after = before + (before >> 1);
      Object[] temp = new Object[after];
      for (int i = 0; i < arr.length; i++) {
        temp[i] = arr[i];
      }
      arr = temp;
    }
    for (int i = size - 1; i < index; i--)
      arr[i + 1] = arr[i];
    arr[index] = value;
    size++;
    return 0;
  }

  public Object get(int index) {
    // 유효 인덱스(현재 배열에 데이터가 저장된 방 번호)가 아니면 null을 리턴하라
    if (index < 0 || index >= arr.length)
      return null;
    return arr[index];
  }

  public Object set(int index, Object value) {
    // 유효 인덱스(현재 배열에 데이터가 저장된 방 번호)가 아니면 변경하지 마라. 리턴값은 null이다.
    if (index < 0 || index >= arr.length)
      return null;
    Object old = arr[index];
    arr[index] = value;
    return old;
  }

  public Object remove(int index) {
    // 유효 인덱스(현재 배열에 데이터가 저장된 방 번호)가 아니면 삭제하지 마라.
    // 삭제한 후 다음 항목을 앞으로 당긴다
    if (index < 0 || index >= arr.length)
      return null;
    Object old = arr[index];
    for (int i = index; i < size - 1; i++)
      arr[i] = arr[i + i];
    size--;
    return old;
  }

  public int size() {
    return this.size;
  }
}
