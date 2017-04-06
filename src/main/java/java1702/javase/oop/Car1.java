package java1702.javase.oop;

/**
 * Created by Li chengjun
 * on 2017/4/6 19:11.
 */

//子类 car1  子类bike  父类 vehicle
public class Car1 extends Vehicle {

    public Car1(String name, double speed, String color) {
        super(name, speed, color);
    }

    public void run() {
        System.out.println("car1:"+ getName() + "is running...");
    }
    public void stop(){
        System.out.println("car1:"+ getName() + "is stopping...");
    }

    public static void main(String[] args) {
        Car1 car1 = new Car1("Tom's car1",30d,"red");
       car1.run();
       car1.stop();
    }
}
