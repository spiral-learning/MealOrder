import java.util.Scanner;

public class App {

  public static void main(String[] args) {

    do {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Burger option: [r]egular, [c]heese (or 'x' for exit): ");
      String burger = scanner.nextLine().toLowerCase();
      if (burger.equals("x")) {
        break; // exit the while loop
      } else if (burger.equals("r")) {
        burger = Burger.BURGER_REGULAR;
      } else {
        burger = Burger.BURGER_CHEESE;
      }

      System.out.println("Drink size: [r]egular, [l]arge: ");
      String size = scanner.nextLine().toLowerCase();
      if (size.equals("r")) {
        size = Drink.DRINK_REGULAR;
      } else {
        size = Drink.DRINK_LARGE;
      }

      MealOrder mealOrder = new MealOrder(burger, size);

      System.out.println("Meal price is: " + mealOrder.price());
    } while (true);

    System.out.println("Thank you for coming!");

  }
}
