public class Drink extends Quantifiable implements MenuItem {

  public static final String DRINK_REGULAR = "regular";
  public static final String DRINK_LARGE = "large";

  private String drinkSize = ""; // regular or large

  public Drink() {
  }

  public Drink(String theDrinkSize) {
    drinkSize = theDrinkSize;
  }

  @Override
  public int basePrice() {
    int price = 0;
    if (drinkSize.equals(DRINK_REGULAR)) {
      price = 1;
    } else if (drinkSize.equals(DRINK_LARGE)) {
      price = 2;
    }
    return price;
  }

  @Override
  public String toString() {
    return "Drink Size: " + drinkSize;
  }
}
