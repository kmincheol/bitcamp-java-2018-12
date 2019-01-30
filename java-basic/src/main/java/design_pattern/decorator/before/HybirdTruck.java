package design_pattern.decorator.before;

public class HybirdTruck extends Hybird {

  public void dump() {
    this.stop();
    System.out.println("짐을 내린다.");
    this.run();
  }
}
