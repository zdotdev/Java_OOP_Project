public class ClassAndMethod {
  // Attributes
  String name;
  int calories;
  double price;
  boolean isGlutenFree;

  // Method
  public void describe() {
    System.out.println("Take this Cupcake");
    System.out.println("--------------------");
    System.out.println("Cupcake Name: " + name);
    System.out.println("Calories: " + calories);
    System.out.println("Price: " + price);
    System.out.println("Is Gluten Free: " + isGlutenFree);
    System.out.println("--------------------");
  }

  public static void run() {
    // Create an instance of the Cupcake class
    ClassAndMethod myCupcake = new ClassAndMethod();

    // Set the attributes of the cupcake
    myCupcake.name = "Chocolate";
    myCupcake.calories = 300;
    myCupcake.price = 2.50;
    myCupcake.isGlutenFree = false;

    // Call the describe method
    myCupcake.describe();
  }
}
