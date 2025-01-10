import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Implementation {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.name = "John";
        customer.email = "john@gmail.com";
        customer.password = "123456";
        customer.customerId = 1;

        System.out.println(customer.name);
        System.out.println(customer.email);
        System.out.println(customer.password);

        Product product = new Product();
        product.name = "iPhone";
        product.stockQuantity = "10";
        product.price = 1000;
        product.productId = 1;

        Product product2 = new Product();
        product2.name = "iPad";
        product2.stockQuantity = "5";
        product2.price = 500;
        product2.productId = 2;

        System.out.println(product.name);
        System.out.println(product.stockQuantity);
        System.out.println(product.price);

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.cartItems = new ArrayList<>();
        shoppingCart.customer = customer;
        shoppingCart.totalPrice = 0;

        shoppingCart.addItem(product);
        shoppingCart.addItem(product2);
        shoppingCart.calculateTotalPrice();

        System.out.println(shoppingCart.totalPrice);
        shoppingCart.viewCartItems();
        shoppingCart.removeItem(product2);
        shoppingCart.viewCartItems();
    }
}