public class Main {
  public static void main(String[] args) {
    System.out.println("Should read false: " + DecimalComparator.areEqualByThreeDecimalPlaces(13.4244, 14.4244));
    System.out.println("Should read true: " + DecimalComparator.areEqualByThreeDecimalPlaces(13.4244, 13.4245));
    System.out.println("Should read true: " + DecimalComparator.areEqualByThreeDecimalPlaces(-3.175, -3.1756));
    System.out.println("Should read false: " + DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176));
  }
}