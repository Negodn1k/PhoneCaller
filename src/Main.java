public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone("Samsung", 10, 255, false, "Aleksander",
                454678);

        System.out.println("Phone model: " + phone.model);
        System.out.println("Phone age: " + phone.age);
        System.out.println("Phone weight: " + phone.weight);
        System.out.print("Phone has sim: ");
        if (phone.getSimCard()) {
            System.out.println("Sim card found");
        } else {
            System.out.println("Sim Card has ejected");
        System.out.println("Caller name: " + phone.getCallerName());
        System.out.println("Phone number:" + phone.getPhoneNumber());

        System.out.println("=========================================================================================");

        phone.model = "LG";
        phone.age = 5;
        phone.weight = 555;

        phone.setCallerName("Max");
        phone.setPhoneNumber(192949);

        System.out.println("Phone model: " + phone.model);
        System.out.println("Phone age: " + phone.age);
        System.out.println("Phone weight: " + phone.weight);
        System.out.print("Phone has sim: ");
        phone.setHasSimCard(false);
        System.out.println("Caller name: " + phone.getCallerName());
        System.out.println("Phone number:" + phone.getPhoneNumber());

        System.out.println("=========================================================================================");

        phone.model = "Xiaomi";
        phone.age = 2;
        phone.weight = 600;

        phone.setCallerName("Alice");
        phone.setPhoneNumber(123051);

        System.out.println("Phone model: " + phone.model);
        System.out.println("Phone age: " + phone.age);
        System.out.println("Phone weight: " + phone.weight);
        System.out.print("Phone has sim: ");
        phone.setHasSimCard(true);
        System.out.println("Caller name: " + phone.getCallerName());
        System.out.println("Phone number:" + phone.getPhoneNumber());
    }
}}