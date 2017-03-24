package java1702.javase.basic;

/**
 * Created by lichengjun on 2017/3/15.
 */
public class Calculator {
    public static void main(String[] args) {

    }



    class Cube {
        double length;
        double width;
        double height;

        public Cube(double length, double width, double height) {
            this.length = length;
            this.width = width;
            this.height = height;
        }
        public double getVolume() {
            return length * width * height;
        }
        }
    }
