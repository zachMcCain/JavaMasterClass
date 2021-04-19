public class Main {
  public static void main(String[] args) {
    System.out.println("Should read false: " + EqualSumChecker.hasEqualSum(1, 1, 1));
    System.out.println("Should read true: " + EqualSumChecker.hasEqualSum(1, 1, 2));
    System.out.println("Should read true: " + EqualSumChecker.hasEqualSum(1, -1, 0));
  }
}