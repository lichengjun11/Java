package java1702.javase.oop;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

import java.awt.*;

/**
 * Created by lichengjun on 2017/3/17.
 */

//51,52
public class Oop6 {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.getType());
        System.out.println(car.getColor());
        Car car2 = new Car("黑色","轿车");

        System.out.println(car2.getType());
        System.out.println(car2.getColor());
    }
}

class Car {
    private String color;
    private String type;

    public Car(String color, String type) {
        this.color = color;
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public Car() {
    color = "红色";
    type = "轿车";
}
}
