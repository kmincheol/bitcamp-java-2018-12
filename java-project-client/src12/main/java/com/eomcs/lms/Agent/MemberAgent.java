package com.eomcs.lms.Agent;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import com.eomcs.lms.domain.Member;

public class MemberAgent {
  @SuppressWarnings("unchecked")
  public static List<Member> list(ObjectInputStream in, ObjectOutputStream out) throws Exception {
    out.writeUTF("/member/list");
    out.flush();
    if (!in.readUTF().equals("OK"))
      throw new Exception("서버에서 해당 명령어를 처리하지 못합니다.");

    String status = in.readUTF();
    if (!status.equals("OK"))
      throw new Exception("데이터 목록 가져오기 실패");

    return (List<Member>) in.readObject();
  }

  public static void add(Member member, ObjectInputStream in, ObjectOutputStream out)
      throws Exception {

    out.writeUTF("/member/add");
    out.writeObject(member);
    out.flush();
    if (!in.readUTF().equals("OK"))
      throw new Exception("서버에서 해당 명령어를 처리하지 못합니다.");

    String status = in.readUTF();
    if (!status.equals("OK"))
      throw new Exception("데이터 추가 실패");
  }

  public static Member get(int no, ObjectInputStream in, ObjectOutputStream out) throws Exception {
    out.writeUTF("/member/detail");
    out.writeInt(no);
    out.flush();
    if (!in.readUTF().equals("OK"))
      throw new Exception("서버에서 해당 명령어를 처리하지 못합니다.");

    String status = in.readUTF();
    if (!status.equals("OK"))
      throw new Exception("데이터 가져오기 실패");

    return (Member) in.readObject();
  }

  public static void update(Member member, ObjectInputStream in, ObjectOutputStream out)
      throws Exception {

    out.writeUTF("/member/update");
    out.writeObject(member);
    out.flush();
    if (!in.readUTF().equals("OK"))
      return;

    String status = in.readUTF();
    if (!status.equals("OK"))
      throw new Exception("데이터 업데이트 실패");
  }

  public static void delete(int no, ObjectInputStream in, ObjectOutputStream out) throws Exception {
    out.writeUTF("/member/delete");
    out.writeInt(no);
    out.flush();
    if (!in.readUTF().equals("OK"))
      throw new Exception("서버에서 해당 명령어를 처리하지 못합니다.");

    String status = in.readUTF();
    if (!status.equals("OK"))
      throw new Exception("데이터 삭제 실패");
  }
}


