import java.util.Date;
import java.util.Scanner;


public class ReactionGame2 {
 public static final void main(String args[]) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Be ready!");
    sleepFor(5);
    System.out.println("Quick, hit the enter key!");
    double StartTime = getNowSeconds();
    String input = scanner.nextLine();
    double EndTime = getNowSeconds();
    double result = EndTime - StartTime;
    System.out.println("You took " + (result) + " seconds");
    if (result <= 0.5) {
      System.out.println("Wow, you are super fast!");
    } else if (result > 0.5 && result < 0.8) {
      System.out.println("You are fast, but you should practice more!");
    } else {
      System.out.println("Are you sleeping? You are slower than a turtle!");
    }
    System.out.println("End");
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
