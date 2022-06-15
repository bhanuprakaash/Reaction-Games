import java.util.Date;
import java.util.Scanner;

public class ReactionGame3 {
  public static final void main(String args[]) {

    Scanner scanner = new Scanner(System.in);
    double totalAverage = 0;
    for (int i = 1; i <= 5; i++) {
      System.out.println("Round " + i);
      System.out.println("Be ready!");
      sleepFor(5);
      System.out.println("Quick, hit the enter key!");
      double startTime = getNowSeconds();
      String input = scanner.nextLine();
      double endTime = getNowSeconds();
      double result = endTime - startTime;
      System.out.println("You took " + (result) + " seconds");
      if (result <= 0.5) {
        System.out.println("Wow, you are super fast!\n");
      } else if (result > 0.5 && result < 0.8) {
        System.out.println("You are fast, but you should practice more!\n");
      } else {
        System.out.println("Are you sleeping? You are slower than a turtle!\n");
      }
      totalAverage = totalAverage + result;
    }
    System.out.println("You played 5 rounds and took " + (totalAverage / 5) + " seconds");
    System.out.println("END");
    scanner.close();
  }

  private static void sleepFor(int seconds) {
    try {
      Thread.sleep(seconds * 1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  private static double getNowSeconds() {
    return new Date().getTime() / 1000.0;
  }
}
