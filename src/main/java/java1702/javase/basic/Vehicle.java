package java1702.javase.basic;

/**
 * Created by lichengjun on 2017/3/15.
 */
//交通工具
public class Vehicle {
    String name;
    double weight;
    double price;
    char color;

//    public java1702.javase.basic.Vehicle(String name, double weight, double price, char color) {
//        this.name = name;
//        this.weight = weight;
//        this.price = price;
//        this.color = color;
//    }
        public Vehicle() {
            System.out.println("java1702.javase.basic.Vehicle constructor");
        }
    public void start() {
        System.out.println("java1702.javase.basic.Vehicle is starting...");
    }

    public void stop() {
        System.out.println("java1702.javase.basic.Vehicle is stopping...");
    }

    class Bicycle extends Vehicle {
        String type;

        public Bicycle(String type) {
            this.type = type;
        }
    }
}

    class Ship extends Vehicle {
        boolean waterSurface;//水中；

        public void pullInToShoreDrawAlongside() {
            System.out.println("java1702.javase.basic.Ship is pullInToShoreDrawAlongside..");
        }//靠岸
    }
    class Plane extends Vehicle {
        boolean sky;
        public void landing() {
            System.out.println("java1702.javase.basic.Plane is landing..");
        }
    }




class VehicleTest {
    public static void main(String[] args) {

//        System.out.println((int)vehicle.color);
//        vehicle.stop();
//        java1702.javase.basic.Plane plane = new java1702.javase.basic.Plane();
//        System.out.println(plane.sky);
//        plane.landing();
//       java1702.javase.basic.Ship ship = new java1702.javase.basic.Ship();
//        System.out.println(ship.waterSurface);

    }
}
