import static java.lang.System.exit;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
  public static void printMenu(String[] options) {
    for (String option : options) {
      System.out.println(option);
    }
    System.out.print("Choose your option : ");
  }

  public static void main(String[] args) {
    String[] options = { "0- Exit", "1- Option 1", "2- Option 2", "3- Option 3" };
    Scanner scanner = new Scanner(System.in);
    int option = 1;
    clearConsole();
    while (option != 0) {
      System.out.println("MAIN MENU");
      printMenu(options);
      try {
        option = scanner.nextInt();
        switch (option) {
          case 0:
            exit(0);
            break;
          case 1:
            option1(scanner);
            break;
          case 2:
            option2(scanner);
            break;
          case 3:
            option3(scanner);
            break;
        }
        clearConsole();
      } catch (InputMismatchException ex) {
        clearConsole();
        System.out.println("Please enter an integer value between 0 and " + options.length);
        scanner.next();
      } catch (Exception ex) {
        clearConsole();
        System.out.println("An unexpected error happened. Please try again");
        clearConsole();
      }
    }
  }

  private static void option1(Scanner scanner) {
    clearConsole();
    while (true) {
      clearConsole();
      System.out.println("Thanks for choosing option 1");
      System.out.print("Please enter your name: ");
      String name = scanner.nextLine();
      System.out.println("Hello, " + name);
      System.out.println("1- Run Again");
      System.out.println("0- Back");
      int choice = scanner.nextInt();
      scanner.nextLine();
      if (choice == 0) {
        break;
      }
    }
  }

  private static void option2(Scanner scanner) {
    clearConsole();
    while (true) {
      clearConsole();
      System.out.println("Thanks for choosing option 2");
      System.out.print("Please enter your name: ");
      String name = scanner.nextLine();
      System.out.println("Hello, " + name);
      System.out.println("1- Run Again");
      System.out.println("0- Back");
      int choice = scanner.nextInt();
      scanner.nextLine();
      if (choice == 0) {
        break;
      }
    }
  }

  private static void option3(Scanner scanner) {
    clearConsole();
    while (true) {
      clearConsole();
      System.out.println("Thanks for choosing option 3");
      System.out.print("Please enter your name: ");
      String name = scanner.nextLine();
      System.out.println("Hello, " + name);
      System.out.println("1- Run Again");
      System.out.println("0- Back");
      int choice = scanner.nextInt();
      scanner.nextLine();
      if (choice == 0) {
        break;
      }
    }
  }

  public static void clearConsole() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }
}
