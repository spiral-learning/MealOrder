public abstract class Quantifiable {
  protected int quantity = 1;

  public int price() {
    return basePrice() * quantity;
  }

  public abstract int basePrice();
}
