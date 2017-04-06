package java1702.javase.oop;

/**
 * Created by Li chengjun
 * on 2017/4/6 19:15.
 */
//子类 car1  子类bike  父类 vehicle
public class Bike extends Vehicle{
    private String name;
    private double speed;
    private String color;

    public Bike(String name, double speed, String color) {
        super(name, speed, color);
    }

    public void run(){
        System.out.println("bike:"+ name + "is running...");
    }
    public void stop(){
        System.out.println("bike:" + name + "is stopping...");
    }

    public static void main(String[] args) {
        Vehicle bike = new Bike("Jerry",10,"white");
        bike.stop();
        bike.run();
        bike.info();
    }
}
