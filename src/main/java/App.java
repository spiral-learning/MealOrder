public class App {

  public static void main(String[] args) {
    MealOrder mealOrder = new MealOrder(Burger.BURGER_REGULAR,
                                        Drink.DRINK_LARGE);
    System.out.println("Meal price is: " + mealOrder.price());
  }
}
