package Realisation;

public class Main {
    public static void main(String[] args) {
        Class class1 = new Class1("Nokia", 2, "1212");
        System.out.println(class1.equals(class1));
        Class class2 = new Class2 ("Nokia", 2, "1212");
        Class class22 = new Class2 ("Nokia", 2, "1212");
        System.out.println(class2.equals(class22));
    }
}
