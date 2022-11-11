import java.io.IOException;

public class Phone {
    public String model;
    public static String callerName;
    private static int phoneNumber;
    public static int age;
    public static double weight;
    private static boolean hasSimCard;

    public Phone(String model, int age, double weight, boolean hasSimCard, String callerName, int phoneNumber) {
        this.model = model;
        this.age = age;
        this.weight = weight;
        this.hasSimCard = hasSimCard;
        this.callerName = callerName;
        this.phoneNumber = phoneNumber;
    }

    public boolean getSimCard() {
        return hasSimCard;
    }

    public void setHasSimCard(boolean hasSimCard) {
        if (hasSimCard == true) {
            this.hasSimCard = hasSimCard;
            System.out.println("Sim card found");
        } else {
            System.out.println("Sim Card has ejected");
        }
    }

    public String getCallerName() {
        return callerName;
    }

    public void setCallerName(String callerName) {
        if (callerName == "") {
            System.out.println("Caller name is not found");
        } else {
            this.callerName = callerName;
        }
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) throws Exception {
        if (phoneNumber > 0 | phoneNumber < 0 | phoneNumber == 0) {
            this.phoneNumber = phoneNumber;
        } else {
            System.out.println("SPAM");
        }
    }
}