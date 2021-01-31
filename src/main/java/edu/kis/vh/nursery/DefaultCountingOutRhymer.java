package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

  private static final int VALUE = -1;
  private static final int SIZE = 12;
  private static final int CAPACITY = 11;
  private final int[] numbers = new int[getSIZE()];
  private int total = getVALUE();

  public void countIn(int in) {
    if (!isFull())
      numbers[total = getTotal() + 1] = in;
  }

  public boolean callCheck() {
    return getTotal() == getVALUE();
  }

  public boolean isFull() {
    return getTotal() == getCAPACITY();
  }

  protected int peekaboo() {
    if (callCheck())
      return getVALUE();
    return numbers[getTotal()];
  }

  public int countOut() {
    if (callCheck())
      return getVALUE();
    return numbers[total = getTotal() - 1];
  }

  public int getTotal() {
    return total;
  }

  public static int getVALUE() {
    return VALUE;
  }

  public static int getSIZE() {
    return SIZE;
  }

  public static int getCAPACITY() {
    return CAPACITY;
  }
}
