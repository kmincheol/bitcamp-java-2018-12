package com.eomcs.util;


public class Stack<E> implements Cloneable {

  public static final int DEFAULT_SIZE = 5;

  private E[] list;
  private int size=0;

  @SuppressWarnings("unchecked")
  public Stack() {
    list = (E[]) new Object[DEFAULT_SIZE];
  }

  @SuppressWarnings("unchecked")
  @Override
  public Stack<E> clone() throws CloneNotSupportedException {
    return (Stack<E>) super.clone();
  }
  
  @SuppressWarnings("unchecked")
  public void push(E value) {
    // 맨 마지막에 추가한다.
    // 배열의 크기가 작다면 확장해야 한다.
    if (size == list.length) {
      int before = list.length;
      int after = before + (before >> 1);
      Object[] arr = new Object[after];
      for (int i = 0; i < list.length; i++) {
        arr[i] = list[i];
      }
      list = (E[]) arr;
    }
    list[size++] = value;
  }

  @SuppressWarnings("unchecked")
  public E pop() {
    // 맨 마지막 값을 꺼내 리턴한다.
    // 꺼낸 값을 배열에서 제거되어야 한다.
    if (size == 0)
      return null;
    return (E) list[--size];
  }

  public boolean empty() {
    return size == 0;
  }

  public int size() {
    return this.size;
  }
}
