public class Burger extends MenuItem {

  public static final String BURGER_CHEESE = "cheeseburger";
  public static final String BURGER_REGULAR = "regular";

  private String burgerType = "";

  public Burger(String newBurgerType) {
    burgerType = newBurgerType;
  }

  @Override
  public int price() {
    if (burgerType.equals(BURGER_REGULAR)) {
      return 5;
    } else if (burgerType.equals(BURGER_CHEESE)) {
      return 6;
    }
    return 0;
  }
}
