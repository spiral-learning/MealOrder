public class Drink implements MenuItem {

  public static final String DRINK_REGULAR = "regular";
  public static final String DRINK_LARGE = "large";

  private String drinkSize = ""; // regular or large

  public Drink() {
  }

  public Drink(String theDrinkSize) {
    drinkSize = theDrinkSize;
  }

  @Override
  public int price() {
    if (drinkSize.equals(DRINK_REGULAR)) {
      return 1;
    } else if (drinkSize.equals(DRINK_LARGE)) {
      return 2;
    }
    return 0;
  }

  @Override
  public String toString() {
    return "Drink Size: " + drinkSize;
  }
}
