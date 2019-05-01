public class MyChair {
  private int num_legs; // state

  public MyChair(int num_legs) { // custom constructor
    this.num_legs = num_legs; // need 'this.' bc state name is === parameter name
  }
}