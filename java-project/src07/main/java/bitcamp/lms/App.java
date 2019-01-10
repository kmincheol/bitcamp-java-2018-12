package bitcamp.lms;

public class App {

  public static void main(String[] args) {
    java.util.Scanner keyboard = new java.util.Scanner(System.in);

    int index = 0;
    int indexprint = 0;

    Lesson[] lessonData = new Lesson[10]; // 레퍼런스 변수 생성
    for (; index < lessonData.length; index++) {
      lessonData[index] = new Lesson(); // 레퍼런스 0번째에 인스턴스 생성

      System.out.print("번호? ");
      lessonData[index].num = keyboard.nextInt();

      keyboard.nextLine();

      System.out.print("수업명? ");
      lessonData[index].className = keyboard.nextLine();

      System.out.print("수업내용? ");
      lessonData[index].classContents = keyboard.nextLine();

      System.out.print("시작일? ");
      lessonData[index].starDate = keyboard.nextLine();

      System.out.print("종료일? ");
      lessonData[index].endDate = keyboard.nextLine();

      System.out.print("총수업시간? ");
      lessonData[index].totalDate = keyboard.nextInt();

      System.out.print("일수업시간? ");
      lessonData[index].totalDay = keyboard.nextInt();

      keyboard.nextLine();

      System.out.print("계속 입력하시겠습니까?(Y/n)");
      String str = keyboard.nextLine();

      if (!str.equalsIgnoreCase("y") && !str.equals("")) {
        while (indexprint <= index) {
          System.out.printf("%d, %-10s, %s ~ %s, %4d\n", lessonData[indexprint].num,
              lessonData[indexprint].className, lessonData[indexprint].starDate,
              lessonData[indexprint].endDate, lessonData[indexprint].totalDate);
          indexprint++;
        }
        break;
      }
    }
  }
}

