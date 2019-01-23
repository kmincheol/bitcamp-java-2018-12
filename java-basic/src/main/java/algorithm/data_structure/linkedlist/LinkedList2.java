package algorithm.data_structure.linkedlist;

public class LinkedList2 {


  public LinkedList2() {

  }


  public void add(Object value) {
    // 파라미터로 받은 value 값을 tail.value 에 넣는다


    // 새 노드를 준비한다.


    // 마지막 노드에 다음으로 새 노드를 가리키게 한다.


    // 새 노드의 이전으로 마지막 노드를 가리키게 한다.


    // tail이 새로 추가된 노드를 가리키게 한다.


    // 항목 개수를 증가시킨다.

  }

  public int size() {

  }

  // ArrayList와 달리 해당 인덱스를 찾아가려면 링크를 따라가야하기 때문에
  // 조회 속도가 느리다.
  public Object get(int index) {


    // 해당 인덱스로 이동한다.


    // cursor가 가리키는 노드의 주소를 리턴? -> 아니다.
    // => 노드의 값을 리턴

  }

  public Object[] toArray() {

  }

  public Object set(int index, Object value) {

    // 노드의 커서는 head부터 시작한다.


    // 교체할 값이 들어있는 노드로 이동한다.


    // 변경 전에 이전 값을 보관한다.


    // 값을 변경한다.


    // 이전 값을 리턴한다. 쓰든 안쓰든 호출하는 사람이 알아서 할 일이다.
    // 다만 변경 전 값을 활용할 경우를 대비해 리턴하는 것이다

  }

  // 값을 삽입하는 경우에는 ArrayList 방식 보다 효율적이다.
  // 삽입 위치에 있는 노드를 찾은 후에 새 노드를 앞, 뒤 노드에 연결하면 된다.
  public int insert(int index, Object value) {

    // 새 노드를 만들어 값을 담는다.

    // 삽입할 위치에 있는 원래 노드를 찾는다

    // 새 노드가 찾은 노드를 가리키게 한다.


    // 찾은 노드의 이전 노드 주소를 새 노드의 이전 노드 주소로 설정한다.


    // 찾은 노드의 이전 노드로 새 노드를 가리키게 한다.

    // 이전 노드의 다음 노드로 새 노드를 가리키게 하라.

    // 맨 앞에 노드를 추가할 때는 head를 변경해야 한다.


    // 크기를 늘린다.


  }

  public Object remove(int index) {


    // index 위치에 있는 노드를 찾는다.



    // 찾은 노드의 이전 노드가 다음 노드를 가리키게 한다.

    // 맨 처음 노드를 삭제할 때


    // 찾은 노드의 다음 노드가 이전 노드를 가리키게 한다.

    // JVM(garbage collector)이 가비지를 효과적으로 계산할 수 있도록
    // 가비지가 된 객체는 다른 객체를 가리키지 않도록 한다.


    // 호출한 쪽에서 필요하면 사용하라고 삭제된 값을 리턴해 준다.

  }
}


