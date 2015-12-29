import java.util.*;

public class RandomChoice {
  private static final int CHOICES = 2;
  private static Random randGen = new Random();

  public static void main(String[] args) {
    int wed = 0;
    int thur = 0;

    for (int i = 0; i < 100; i++) {
      int randNum = randGen.nextInt() % CHOICES;

      if (randNum < 0) {
        randNum *= -1;
      }

      if (randNum == 0) {
        wed++;
      }
      else if (randNum == 1) {
        thur++;
      }
    }

    String[] choiceArray = {"Wednesday", "Thursday"};

    System.out.println(choiceArray[0] + ": " + wed);
    System.out.println(choiceArray[1] + ": " + thur);

    //System.out.println("Randomly generated choice: " + choiceArray[randNum]);
  }
}
