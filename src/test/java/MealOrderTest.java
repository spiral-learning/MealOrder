import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MealOrderTest {

  @Test
  public void mealWithRegularBurgerRegularDrinkCosts6() throws Exception {
    MealOrder mealOrder = new MealOrder(BurgerOption.REGULAR, DrinkOption.REGULAR);
    assertEquals(6, mealOrder.price());
  }



  @Test
  public void mealWithBurgerAsEnum() throws Exception {
    MealOrder mealOrder = new MealOrder(BurgerOption.CHEESEBURGER);
    assertEquals(6, mealOrder.price());
  }


  @Test
  public void mealWithBurgerAsString() throws Exception {
    MealOrder mealOrder = new MealOrder(Burger.BURGER_REGULAR);
    assertEquals(5, mealOrder.price());
  }
}
