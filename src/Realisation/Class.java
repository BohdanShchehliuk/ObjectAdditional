package Realisation;

import java.util.Objects;

public class Class {
    private String manufacturer;
    private float price;
    private String serialNumber;

    public Class(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    @Override
    public boolean equals(Object o) {
        //if (this == o) return true;
        if (o == null) return true;
        Class aClass = (Class) o;
        return Float.compare(aClass.price, price) == 0 && Objects.equals(manufacturer, aClass.manufacturer) && Objects.equals(serialNumber, aClass.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, price, serialNumber);
    }

    @Override
    public String toString() {
        return "Class{" +
                "manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }
}
