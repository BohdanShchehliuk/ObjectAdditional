package User;

public class Main {
    public static void main(String[] args) {
        User user1 = new Admin("Bohdan", "booo", "12q2", true, 1225);
        User user2 = new UserOne("Bohdan", "booo", "12q2", true, 1225);
        System.out.println(user1.toString());
        System.out.println(user2.toString());
    }
}
