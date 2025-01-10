/**
 * @author Koirala
 */

public class Workshop7 {
    /**
     * Main Method
     * @param args
     */
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "John";
        student.phoneNumber = 1234567890;
        student.email = "john@gmail.com";
        student.averageMarks = 3.5;

        System.out.println(student.name);
        System.out.println(student.phoneNumber);
        System.out.println(student.email);
        System.out.println(student.averageMarks);

        student.purchaseParkingPass();

        Address address = new Address();
        address.street = "123 Main Street";
        address.city = "Anytown";
        address.state = "CA";
        address.postalCode = "12345";
        address.country = "USA";

        System.out.println(address.outputAsLabel());

        if (address.validate()) {
            System.out.println("Address is valid");
        } else {
            System.out.println("Address is invalid");
        }
        Person person = new Person();
        person.name = "John";
        person.phoneNumber = 1234567890;
        person.email = "john@gmail.com";
        person.address = address;

        Professor professor2 = new Professor();
        professor2.name = "John";
        professor2.phoneNumber = 1234567890;
        professor2.email = "john@gmail.com";
        professor2.student = student;
        professor2.salary = 100000;
        professor2.staffNumber = 123456;
        professor2.numberOfClasses = 10;

        System.out.println(professor2.name);
        System.out.println(professor2.phoneNumber);
        System.out.println(professor2.email);
        System.out.println(professor2.student.name);
        System.out.println(professor2.student.phoneNumber);
        System.out.println(professor2.student.email);
        System.out.println(professor2.student.averageMarks);
        System.out.println(professor2.salary);
        System.out.println(professor2.staffNumber);
        System.out.println(professor2.numberOfClasses);

    }
}
