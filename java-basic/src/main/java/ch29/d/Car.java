// 스프링
package ch29.d;

import java.util.Date;

public class Car {
  private String maker;
  private String model;
  private int cc;
  private int valve;
  private boolean auto;
  private Date createDate;
  private BlackBox blackBox;

  public Car() {
    System.out.println("Car()생성자 호출함");
  }

  @Override
  public String toString() {
    return "Car [maker=" + maker + ", model=" + model + ", cc=" + cc + ", valve=" + valve
        + ", auto=" + auto + ", createDate=" + createDate + ", blackBox=" + blackBox + "]";
  }

  public String getMaker() {
    return maker;
  }

  public void setMaker(String maker) {
    System.out.println("Car.setMaker()");
    this.maker = maker;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    System.out.println("Car.setModel()");
    this.model = model;
  }

  public int getCc() {
    return cc;
  }

  public void setCc(int cc) {
    System.out.println("Car.setCc()");
    this.cc = cc;
  }

  public int getValve() {
    return valve;
  }

  public void setValve(int valve) {
    System.out.println("Car.setVale()");
    this.valve = valve;
  }

  public boolean isAuto() {
    return auto;
  }

  public void setAuto(boolean auto) {
    System.out.println("Car.setAuto()");
    this.auto = auto;
  }

  public Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate(Date createDate) {
    System.out.println("Car.setCreateDate()");
    this.createDate = createDate;
  }

  public BlackBox getBlackBox() {
    return blackBox;
  }

  public void setBlackBox(BlackBox blackBox) {
    System.out.println("Car.setBlackBox()");
    this.blackBox = blackBox;
  }

}
