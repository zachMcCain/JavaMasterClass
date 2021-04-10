public class MoreOnMethods {
  public static void main(String[] args) {

    int highScorePosition = calculateHighScorePosition(400);
    displayHighScorePosition("Phil", highScorePosition);

  }

  public static void displayHighScorePosition(String name, int score) {
    System.out.println(name + " managed to get into position " + score + " on the high score table");
  }

  public static int calculateHighScorePosition(int score) {
    if (score > 1000) {
      return 1;
    } else if (score > 500 && score < 1000) {
      return 2;
    } else if (score > 100 && score < 500) {
      return 3;
    }
    return 4;
  }
}
