import java.util.Date;
import java.util.Scanner;

public class ReactionGame1{

  public static final void main(String args[]) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Be ready!");
    sleepFor(5);
    System.out.println("Quick, hit the enter key!");
    double StartTime = getNowSeconds();
    String input = scanner.nextLine();
    double EndTime = getNowSeconds();
    System.out.println("You took " + (EndTime - StartTime) + " seconds");
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
