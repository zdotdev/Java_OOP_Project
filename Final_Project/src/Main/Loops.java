package Main;


public class Loops {
  public static void run() {
    String[] lights = {"Red", "Green", "Yellow"};
    // For loop
    System.out.println("For loop:");
    for (int i = 0; i < lights.length; i++) {
      System.out.println("Current light: " + lights[i]);
    }

    // While loop
    System.out.println("\nWhile loop:");
    int i = 0;
    while (i < lights.length) {
      System.out.println("Current light: " + lights[i]);
      i++;
    }

    // Do-while loop
    System.out.println("\nDo-while loop:");
    i = 0;
    do {
      System.out.println("Current light: " + lights[i]);
      i++;
    } while (i < lights.length);
  }
}
