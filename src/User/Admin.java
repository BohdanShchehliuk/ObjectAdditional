package User;

public class Admin extends User {
    public Admin(String name, String login, String pass, Boolean axess, int secretNumb) {
        super(name, login, pass, axess, secretNumb);
    }

    @Override
    public String toString() {
        return "Admin{" +
                "name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", axess=" + axess + ", pass = " + getPass() + ", sectetNumb = " + getSecretNumb();
    }
}
