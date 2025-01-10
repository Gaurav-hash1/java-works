public class Address {
    public String street;
    public String city;
    public String state;
    public String postalCode;
    public String country;
    public boolean validate(){
        return true;
    }
    public String outputAsLabel(){
        return street + ", " + city + ", " + state + ", " + postalCode + ", " + country;
    }
}
