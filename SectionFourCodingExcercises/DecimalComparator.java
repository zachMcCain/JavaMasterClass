public class DecimalComparator {
  public static boolean areEqualByThreeDecimalPlaces(double firstDouble, double secondDouble) {
    boolean isEqual = false;
    int firstInt = (int) (firstDouble * 1000);
    int secondInt = (int) (secondDouble * 1000);
    if (firstInt == secondInt) {
      isEqual = true;
    }
    return isEqual;
  }
}
