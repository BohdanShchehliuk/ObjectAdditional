package Realisation;

public class Class3 extends Class{
    public Class3(String manufacturer, float price, String serialNumber) {
        super(manufacturer, price, serialNumber);
    }

    @Override
    public boolean equals(Object o) {
        if (o.hashCode() != this.hashCode()) return false;
                return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
