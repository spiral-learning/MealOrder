import java.util.ArrayList;
import java.util.List;

public class MealOrder {

  List<MenuItem> items = new ArrayList<>();

  public MealOrder() {
  }

  public void addBurger(String burgerType) {
    items.add(new Burger(burgerType));
  }

  public void addDrink(String drinkType) {
    items.add(new Drink(drinkType));
  }

  public MealOrder(String burgerType) {
    addBurger(burgerType);
  }

  public MealOrder(String burgerType, String drinkSize) {
    addBurger(burgerType);
    addDrink(drinkSize);
  }

  public int price() {
    // loop over all items and sum their price
    int price = 0;
    for (MenuItem item: items) {
      price = price + item.price();
    }
    return price;
  }

}
