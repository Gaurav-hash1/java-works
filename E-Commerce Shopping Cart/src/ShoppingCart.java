import java.util.ArrayList;

public class ShoppingCart {
    public ArrayList<Product> cartItems;
    public double totalPrice;
    public Customer customer;
    public void addItem(Product product){
        cartItems.add(product);
    }
    public void removeItem(Product product){
        cartItems.remove(product);
    }
    public void calculateTotalPrice(){
        totalPrice = 0;
        for (Product product : cartItems) {
            totalPrice += product.price;
        }
    }
    public void viewCartItems(){
        customer.addToCart();
    }
}
