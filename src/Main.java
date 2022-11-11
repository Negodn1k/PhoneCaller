import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Phone firstPhone = new Phone("Samsung", 10, 255, false, "Aleksander",
                454678);

        System.out.println("Phone model: " + firstPhone.model);
        System.out.println("Phone age: " + firstPhone.age);
        System.out.println("Phone weight: " + firstPhone.weight);
        System.out.println("Phone has sim: " + firstPhone.getSimCard());
        System.out.println("Caller name: " + firstPhone.getCallerName());
        System.out.println("Phone number:" + firstPhone.getPhoneNumber());

        System.out.println("=========================================================================================");

        Phone secondPhone = new Phone("LG", 5, 155, true, "Max",
                112234);

        System.out.println("Phone model: " + secondPhone.model);
        System.out.println("Phone age: " + secondPhone.age);
        System.out.println("Phone weight: " + secondPhone.weight);
        System.out.println("Phone has sim: " + secondPhone.getSimCard());
        System.out.println("Caller name: " + secondPhone.getCallerName());
        System.out.println("Phone number:" + secondPhone.getPhoneNumber());

        System.out.println("=========================================================================================");

        Phone thirdPhone = new Phone("Xiaomi", 3, 555, false, "Alice",
                142856);

        System.out.println("Phone model: " + secondPhone.model);
        System.out.println("Phone age: " + secondPhone.age);
        System.out.println("Phone weight: " + secondPhone.weight);
        System.out.println("Phone has sim: " + secondPhone.getSimCard());
        System.out.println("Caller name: " + secondPhone.getCallerName());
        System.out.println("Phone number:" + secondPhone.getPhoneNumber());
    }
}