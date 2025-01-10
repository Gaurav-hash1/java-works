public class Person {
    public int personId;
    public String name;
    public int age;
    public String gender;
    public String address;
    public String contactDetails;

    /**
     *
     * @return the personal details
     */
    public String viewPersonalDetails(){
        return "Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Gender: " + gender + "\n" +
                "Address: " + address + "\n" +
                "Contact Details: " + contactDetails;
    }
}
