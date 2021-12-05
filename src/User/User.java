package User;

public class User {
    public String name;
    public String login;
    private String pass;
    public Boolean axess;
    private int secretNumb;

    public User(String name, String login, String pass, Boolean axess, int secretNumb) {
        this.name = name;
        this.login = login;
        this.pass = pass;
        this.axess = axess;
        this.secretNumb = secretNumb;
    }

    public String getPass() {
        return pass;
    }

    public int getSecretNumb() {
        return secretNumb;
    }
}

