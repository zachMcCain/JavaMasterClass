public class FloatAndDouble {
  public static void main(String[] args) {

    float myMinFloatValue = Float.MIN_VALUE;
    float myMaxFloatValue = Float.MAX_VALUE;

    System.out.println("Float minimum value = " + myMinFloatValue);
    System.out.println("Float maximum value = " + myMaxFloatValue);

    double myMinDoubleValue = Double.MIN_VALUE;
    double myMaxDoubleValue = Double.MAX_VALUE;

    System.out.println("Double minimum value = " + myMinDoubleValue);
    System.out.println("Double maximum value = " + myMaxDoubleValue);

    int myIntValue = 5 / 3;
    float myFloatValue = 5f / 3f;
    // float myCastFloatValue = (float) 5.25;
    double myDoubleValue = 5d / 3d;
    System.out.println("My Integer Value = " + myIntValue);
    System.out.println("My Float Value = " + myFloatValue);
    System.out.println("My Double Value = " + myDoubleValue);

    double poundsToBeConverted = 4d;
    double kilogramsFromPounds = poundsToBeConverted * 0.45359237d;
    System.out.println("Kilograms from 4 pounds = " + kilogramsFromPounds);


  }
}
