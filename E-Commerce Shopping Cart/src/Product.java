public class Product {
    public int productId;
    public String name;
    public String stockQuantity;
    public double price;
    public void getDetails(){
        System.out.println("Viewing details");
    }
    public boolean checkAvialability(){
        return true;
    }
}
