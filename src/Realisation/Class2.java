package Realisation;

import java.util.Objects;

public class Class2 extends Class{
    private String manufacturer;
    private float price;
    private String serialNumber;

    public Class2(String manufacturer, float price, String serialNumber) {
        super(manufacturer, price, serialNumber);
    }



    @Override
    public String toString() {
        return "Class2{" +
                "manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() == o.getClass()) return false;
        if (!super.equals(o)) return false;
        Class2 class2 = (Class2) o;
        return Float.compare(class2.price, price) == 0 && Objects.equals(manufacturer, class2.manufacturer) && Objects.equals(serialNumber, class2.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), manufacturer, price, serialNumber);
    }
}
