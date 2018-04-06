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

  public MealOrder(BurgerOption burger) {
    addBurger(burger.name().toLowerCase());
  }

  public MealOrder(String burgerType) {
    addBurger(burgerType);
  }

  public MealOrder(String burgerType, String drinkSize) {
    addBurger(burgerType);
    addDrink(drinkSize);
  }

  public MealOrder(BurgerOption burger,
                   DrinkOption drink) {
    addBurger(burger.name().toLowerCase());
    addDrink(drink.name().toLowerCase());
  }

  public int price() {
    // loop over all items and sum their price
    int price = 0;
    for (MenuItem item: items) {
      price = price + item.price();
    }
    return price;
  }

  public void display() {
    for (MenuItem item: items) {
       item.display();
    }
    System.out.println(price());
  }

  @Override
  public String toString() {
    return "MealOrder{" +
        "items=" + items +
        '}';
  }
}
