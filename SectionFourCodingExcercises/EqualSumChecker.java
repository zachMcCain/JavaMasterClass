public class EqualSumChecker {
  public static boolean hasEqualSum(int firstInt, int secondInt, int thirdInt) {
    boolean isEqual = false;
    if ((firstInt + secondInt) == thirdInt) {
      isEqual = true;
    }
    return isEqual;
  }
}
