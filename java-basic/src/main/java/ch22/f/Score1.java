package ch22.f;

public class Score1 {
  private String name;
  private int kor;
  private int eng;
  private int math;
  private int sum;
  private float aver;

  public Score1() {
    System.out.println("score1()");
  }

  public Score1(String name, int kor, int eng, int math) {
    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
    compute();
  }

  @Override
  public String toString() {
    return "Score1 [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum="
        + sum + ", aver=" + aver + "]";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;

  }

  public int getKor() {
    return kor;
  }

  public void setKor(int kor) {
    this.kor = kor;
    compute();
  }

  public int getMath() {
    return math;
  }

  public void setMath(int math) {
    this.math = math;
    compute();
  }

  public float getAver() {
    return aver;
  }

  public void setAver(int aver) {
    this.aver = aver;
  }

  public int getEng() {
    return eng;
  }

  public int getSum() {
    return sum;
  }

  public void setEng(int eng) {
    this.eng = eng;
    compute();
  }

  public void compute() {
    sum = kor + eng + math;
    aver = sum / 3f;
  }
}
