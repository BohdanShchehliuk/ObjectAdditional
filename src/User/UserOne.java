package User;

public class UserOne extends User {

    public UserOne(String name, String login, String pass, Boolean axess, int secretNumb) {
        super(name, login, pass, axess, secretNumb);
    }

    @Override
    public String toString() {
        return "UserOne{" +
                "name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", axess=" + axess +
                '}';
    }
}
