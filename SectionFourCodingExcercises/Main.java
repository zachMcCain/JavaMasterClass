public class Main {
  public static void main(String[] args) {
    System.out.println("Should read false: " + LeapYear.isLeapYear(-1600));
    System.out.println("Should read true: " + LeapYear.isLeapYear(1600));
    System.out.println("Should read false: " + LeapYear.isLeapYear(2017));
    System.out.println("Should read true: " + LeapYear.isLeapYear(2000));
    System.out.println("Should read false: " + LeapYear.isLeapYear(1700));
    System.out.println("Should read false: " + LeapYear.isLeapYear(1800));
    System.out.println("Should read false: " + LeapYear.isLeapYear(1900));
    System.out.println("Should read false: " + LeapYear.isLeapYear(2100));

  }
}