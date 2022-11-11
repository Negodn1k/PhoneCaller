public class Phone {
    public  String model;
    private static String callerName;
    private static int phoneNumber;
    public int age;
    public double weight;
    private static boolean hasSimCard;

    public Phone(String model, int age, double weight, boolean hasSimCard, String callerName, int phoneNumber) {
        this.model = model;
        this.age = age;
        this.weight = weight;
        Phone.hasSimCard = hasSimCard;
        Phone.callerName = callerName;
        Phone.phoneNumber = phoneNumber;
    }

    public boolean getSimCard() {
        return hasSimCard;
    }

    public void setHasSimCard(boolean hasSimCard) {
        if (hasSimCard) {
            Phone.hasSimCard = hasSimCard;
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
            Phone.callerName = callerName;
        }
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        try {
            Phone.phoneNumber = phoneNumber;
        } catch (TypeNotPresentException e) {
            System.out.println("SPAM");
        }
    }
}