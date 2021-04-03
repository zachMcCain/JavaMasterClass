public class IfThen {
  public static void main(String[] args) {

    boolean isAlien = false;
    if (isAlien == true)
      System.out.println("It is not an alien!");  // The semicolon is what completes the if statement
      System.out.println("And I am scared of aliens");
    // Better to add a code block
    if (isAlien == false) {
      System.out.println("It is not an alien!");
      System.out.println("And I am scared of aliens");
    }

    int isCar = 3;
    if (isCar == 3) {
      System.out.println("The car is real");
    }
  }
}
