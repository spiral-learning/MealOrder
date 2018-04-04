import org.junit.Test;

import static org.junit.Assert.*;

public class MealOrderTest {

  @Test
  public void mealWithRegularBurgerRegularDrinkCosts6() throws Exception {
    MealOrder mealOrder = new MealOrder(Burger.BURGER_CHEESE,
                                        Drink.DRINK_REGULAR);
    assertEquals(7, mealOrder.price());
  }

}
