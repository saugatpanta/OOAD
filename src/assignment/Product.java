package assignment;

public class Product {
  private String name;
  private float price;
  private float sellingPrice = 0F;

  public Product(String name, float price) {
    this.name = name;
    this.price = price;
  }

  public float calculateSP(float discount_amount) {
    this.sellingPrice =  price - discount_amount;
    return this.sellingPrice;
  }

  public void printDetails(){
    System.out.println("Name: " + name);
    System.out.println("Actual Price: " + price);
    System.out.println("Selling Price: " + sellingPrice);
  }
}
