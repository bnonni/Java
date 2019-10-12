public class EvenflowFunctions implements EvenflowInterface {
  @Override
  public void addition(int x, int y) throws OverUnderFlowException {
    long add = (long) x + (long) y;
    if (add > Integer.MAX_VALUE) {
      throw new OverUnderFlowException("OverflowException on addition: result: too many bits, too large.");
    } else {
      System.out.println("Result of " + x + " + " + y + " = " + (int) add);
    }

  }

  @Override
  public void subtraction(int a, int b) throws OverUnderFlowException {
    long sub = (long) a - (long) b;
    if (sub < Integer.MIN_VALUE) {
      throw new OverUnderFlowException("UnderflowException on subtraction: result: too few bits, too small");
    } else {
      System.out.println("Result of " + a + " - " + b + " = " + (int) sub);
    }
  }
}
