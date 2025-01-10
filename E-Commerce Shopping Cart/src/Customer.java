public class Customer {
    public int customerId;
    public String name;
    public String email;
    public String password;
    public void register(){
        System.out.println("Registered");
    }
    public void login(){
        System.out.println("Logged in");
    }
    public void viewProducts(){
        System.out.println("Viewing products");
    }
    public void addToCart(){
        System.out.println("Added to cart");
    }
    public void checkout(){
        System.out.println("Checked out");
    }
}
