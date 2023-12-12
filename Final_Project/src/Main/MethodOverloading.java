package Main;

public class MethodOverloading {
  // Method 1: greet in English
  public void greet() {
    System.out.println("Hello");
  }

  // Method 2: greet in Tagalog or Spanish
  public void greet(String language) {
    if (language.equals("Tagalog")) {
      System.out.println("Kamusta!");
    } else if (language.equals ("Spanish")) {
      System.out.println("Hola");
    } else {
      System.out.println("Bonjour");
    }
  }

  public static void run() {
    MethodOverloading greet = new MethodOverloading();
    greet.greet();
    greet.greet("Tagalog");
    greet.greet("Spanish");
    greet.greet("French");
    System.out.println("------------");
  }
}
