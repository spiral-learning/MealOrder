import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BurgerTest {

  @Test
  public void regularBurgerCosts5() throws Exception {
    Burger burger = new Burger(Burger.BURGER_REGULAR);
    assertEquals(5, burger.price());
  }

  @Test
  public void cheeseburgerCosts6() throws Exception {
    Burger burger = new Burger(Burger.BURGER_CHEESE);
    assertEquals(6, burger.price());
  }


}