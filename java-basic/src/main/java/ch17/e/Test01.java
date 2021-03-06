// 추상 메서드의 효용성 - 서브 클래스에서 구현하도록 강제하는 효과가 있다.
package ch17.e;

public class Test01 {
  public static void main(String[] args) {
    int[] values = {23, 7, 12, 15, 9, 2, 22, 11, 25, 13, 5};
    int[] values2 = {23, 7, 12, 15, 9, 2, 22, 11, 25, 13, 5};
    int[] values3 = {23, 7, 12, 15, 9, 2, 22, 11, 25, 13, 5};

    display(new BubbleSort(), values);
    display(new QuickSort(), values2);

    // 이제 MergeSort는 sorter의 추상 메서드인 sort()를 구현했다.
    // 정사적으로 동작할 것이다.
    //
    display(new MergeSort(), values3);
  }

  // 정렬을 수행하는 객체와 값을 주면
  // 그 값을 정렬한 후 출력하는 메서드이다.
  static void display(Sorter sorter, int[] values) {

    // 정렬 객체의 클래스가 뭔지 상관 없다.
    // 그 클래스를 사용할 때는 공통 분모가 되는 수퍼 클래스의 메서드를 호출한다.
    sorter.sort(values);

    // 정렬된 값을 출력한다.
    for (int value : values) {
      System.out.print(value + ",");
    }
    System.out.println();
  }
}
