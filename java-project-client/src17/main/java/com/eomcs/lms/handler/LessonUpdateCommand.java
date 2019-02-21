package com.eomcs.lms.handler;
import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.dao.LessonDao;
import com.eomcs.lms.dao.mariadb.LessonDaoImpl;
import com.eomcs.lms.domain.Lesson;

public class LessonUpdateCommand implements Command {

  Scanner keyboard;
  LessonDao lessonDao;
  
  public LessonUpdateCommand(Scanner keyboard, LessonDaoImpl lessonDao) {
    this.keyboard = keyboard;
    this.lessonDao = lessonDao;
  }
  

  @Override
  public void execute() {

    try {
      System.out.print("번호? ");
      Lesson lesson = new Lesson();
      lesson.setNo(Integer.parseInt(keyboard.nextLine()));
    
      System.out.printf("수업명? ");
      String input = keyboard.nextLine();
      if (input.length() > 0) 
        lesson.setTitle(input);
      
      System.out.printf("설명? ");
      if ((input = keyboard.nextLine()).length() > 0)
        lesson.setContents(input);
      
      System.out.printf("시작일? ");
      if ((input = keyboard.nextLine()).length() > 0)
        lesson.setStartDate(Date.valueOf(input));
      
      System.out.printf("종료일? ");
      if ((input = keyboard.nextLine()).length() > 0)
        lesson.setEndDate(Date.valueOf(input));
      
//      System.out.printf("총수업시간(%d)? ", lesson.getTotalHours());
//      if ((input = keyboard.nextLine()).length() > 0)
//        lesson.setTotalHours(Integer.parseInt(input));
//      
//      System.out.printf("일수업시간(%d)? ", lesson.getDayHours());
//      if ((input = keyboard.nextLine()).length() > 0)
//        lesson.setDayHours(Integer.parseInt(input));
      
      lessonDao.update(lesson);
      System.out.println("변경했습니다.");
      
    } catch (Exception e) {
      System.out.printf("실행 오류! : %s\n", e.getMessage());
    }
  }
}
