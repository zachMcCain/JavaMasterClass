public class Main {

  public static void main(String[] args) {
    int myValue = 10000;

    int myMinIntValue = Integer.MIN_VALUE;
    int myMaxIntValue = Integer.MAX_VALUE;
    System.out.println("Integer minimum value = " + myMinIntValue);
    System.out.println("Integer maximum value = " + myMaxIntValue);
    System.out.println("Busted max value (Overflow) = " + (myMaxIntValue + 1));
    System.out.println("Busted min value (Underflow) = " + (myMinIntValue - 1));
  }
}
