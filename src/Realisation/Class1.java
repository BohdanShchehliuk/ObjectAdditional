package Realisation;

import java.util.Objects;

public class Class1 extends Class {
    private String manufacturer;
    private float price;
    private String serialNumber;

    public Class1(String manufacturer, float price, String serialNumber) {
        super(manufacturer, price, serialNumber);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Class1 class1 = (Class1) o;
        return Float.compare(class1.price, price) == 0 && Objects.equals(manufacturer, class1.manufacturer) && Objects.equals(serialNumber, class1.serialNumber);
    }

}
