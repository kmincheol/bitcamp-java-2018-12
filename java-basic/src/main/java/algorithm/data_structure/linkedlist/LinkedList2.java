package algorithm.data_structure.linkedlist;

public class LinkedList2 {
  Node head;
  Node tail;
  int size;

  public LinkedList2() {
    head = new Node();
    tail = head;
    size = 0;
  }


  public void add(Object value) {}

  public int size() {
    return size;
  }

  public Object get(int index) {}

  public Object[] toArray() {

  }

  public Object set(int index, Object value) {}

  // 값을 삽입하는 경우에는 ArrayList 방식 보다 효율적이다.
  // 삽입 위치에 있는 노드를 찾은 후에 새 노드를 앞, 뒤 노드에 연결하면 된다.
  public int insert(int index, Object value) {
    if (index < 0 || index >= size) {
      return -1;
    }
    Node node = new Node(value);
    Node cursor = head;
    for (int i = 1; i <= size; i++) {
      cursor = cursor.next;
    }
    node.next = cursor;
    node.prev = cursor.prev;
    if (node.prev != null) {
      node.prev.next = node;
    } else
      head = node;
    size++;
    return 0;

  }


  public Object remove(int index) {
    if (index < 0 || index >= size)
      return null;
    Node cursor = head;
    for (int i = 1; i <= size; i++) {
      cursor = cursor.next;
    }

    if (cursor.prev != null) {
      cursor.prev.next = cursor.next;

    } else {
      head = cursor.next;
    }
    cursor.next.prev = cursor.prev;

    Object old = cursor.value;
    cursor.value = null;
    cursor.prev = null;
    cursor.next = null;

    size--;

    return old;

  }
}


