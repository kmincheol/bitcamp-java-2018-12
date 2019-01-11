package bitcamp.lms.handler;

import java.util.Scanner;
import bitcamp.lms.domain.Lesson;

public class LessonHandler {
  public static Scanner keyboard;
  static int LENGTH = 10;
  static Lesson[] lesson = new Lesson[LENGTH];
  static int indexLesson = 0;

  public static void addLesson() {
    Lesson lessons = new Lesson();
    System.out.print("번호? ");
    lessons.num = keyboard.nextInt();

    keyboard.nextLine();

    System.out.print("수업명? ");
    lessons.className = keyboard.nextLine();

    System.out.print("수업내용? ");
    lessons.classContents = keyboard.nextLine();

    System.out.print("시작일? ");
    lessons.starDate = keyboard.nextLine();

    System.out.print("종료일? ");
    lessons.endDate = keyboard.nextLine();

    System.out.print("총수업시간? ");
    lessons.totalDate = keyboard.nextInt();

    System.out.print("일수업시간? ");
    lessons.totalDay = keyboard.nextInt();
    keyboard.nextLine();

    System.out.println("저장하였습니다.");
    System.out.println();
    lesson[indexLesson] = lessons;
    indexLesson++;
  }

  public static void listLesson() {
    if (indexLesson == 0) {
      System.out.println("저장된 정보가 없습니다. 명령을 다시 입력하세요");
    } else {
      for (int indexprint = 0; indexprint < indexLesson; indexprint++) {
        System.out.printf("%d, %s, %s ~ %s, %d\n", lesson[indexprint].num,
            lesson[indexprint].className, lesson[indexprint].starDate, lesson[indexprint].endDate,
            lesson[indexprint].totalDate);
      }
    }
    System.out.println();
  }
}
