// 데이터 처리 관련 코드를 별도의 클래스로 분리
package com.eomcs.lms.dao;

import java.util.List;
import com.eomcs.lms.domain.Board;

public class BoardDaoImpl extends AbstractDao<Board> implements BoardDao {

  public BoardDaoImpl(String filepath) {
    this.filepath = filepath;
  }

  public void insert(Board board) {
    try {
      list.add(board);
      this.saveData();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  public List<Board> findAll() {
    return list;
  }

  public Board findByNo(int no) {
    for (Board obj : list) {
      if (obj.getNo() == no) {
        return obj;
      }
    }
    return null;
  }

  public int update(Board board) {
    try {
      int index = 0;
      for (Board obj : list) {
        if (obj.getNo() == board.getNo()) {
          list.set(index, board);
          this.saveData();
          return 1;
        }
        index++;
      }
      return 0;
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  public int delete(int no) {
    try {
      int index = 0;
      for (Board obj : list) {
        if (obj.getNo() == no) {
          list.remove(index);
          this.saveData();
          return 1;
        }
        index++;
      }
      return 0;
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

}







