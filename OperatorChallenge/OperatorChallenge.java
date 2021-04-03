public class OperatorChallenge {
  public static void main(String[] args) {
    double myDouble = 20.00d;
    double myBiggerDouble = 80.00d;
    double addedDouble = (myDouble + myBiggerDouble) * 100;
    double remainder = addedDouble % 40.00;
    boolean isZero = (remainder == 0) ? true : false;
    System.out.println(isZero);
    if (!isZero) {
      System.out.println("Got some remainder");
    }

  }
}
