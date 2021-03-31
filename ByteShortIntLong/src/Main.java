public class Main {

  public static void main(String[] args) {

    int myValue = 10000;

    int myMinIntValue = Integer.MIN_VALUE;
    int myMaxIntValue = Integer.MAX_VALUE;
    System.out.println("Integer minimum value = " + myMinIntValue);
    System.out.println("Integer maximum value = " + myMaxIntValue);
    System.out.println("Busted max value (Overflow) = " + (myMaxIntValue + 1));
    System.out.println("Busted min value (Underflow) = " + (myMinIntValue - 1));

    int myMaxIntTest = 2_147_483_647;
    System.out.println("Writing an int with underscores: " + myMaxIntTest);

    byte myMinByteValue = Byte.MIN_VALUE;
    byte myMaxByteValue = Byte.MAX_VALUE;
    System.out.println("Byte Minimum Value = " + myMinByteValue);
    System.out.println("Byte Maximum Value = " + myMaxByteValue);

    short myMinShortValue = Short.MIN_VALUE;
    short myMaxShortValue = Short.MAX_VALUE;
    System.out.println("Short Minimum Value = " + myMinShortValue);
    System.out.println("Short Maximum Value = " + myMaxShortValue);

    long myMinLongValue = Long.MIN_VALUE;
    long myMaxLongValue = Long.MAX_VALUE;
    System.out.println("Long Minimum Value = " + myMinLongValue);
    System.out.println("Long Maximum Value = " + myMaxLongValue);

    long myLongValue = 2_147_483_647_123L;
    System.out.println(myLongValue);

    // short bigShortLiteralValue = 32768;


    // CASTING
    int myTotal = (myMinIntValue / 2);

    byte myNewByteValue = (byte) (myMinByteValue / 2); // Using casting here because otherwise myMinByteValue is treated as an int.

    short myNewShortValue = (short) (myMinShortValue / 2);


    byte smallNum = 5;
    short smallishNum = 58;
    int regularNum = 2309;
    long bigNum = 50000 + (10 * (smallNum + smallishNum + regularNum));

    System.out.println("This is my big number: " + bigNum);
  }
}
