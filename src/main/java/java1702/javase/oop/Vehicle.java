package java1702.javase.oop;

/**
 * Created by Li chengjun
 * on 2017/4/6 19:18.
 */
//子类 car1  子类bike  父类 vehicle
public abstract class Vehicle {
    private String name;

    public Vehicle(String name, double speed, String color) {
        this.name = name;
        this.speed = speed;
        this.color = color;
    }

    private double speed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
}

    private String color;

    public abstract void run();
    public abstract void stop();
    public void info() {
        System.out.println("color is:" + color +"; speed is:" + speed );
    }
}
