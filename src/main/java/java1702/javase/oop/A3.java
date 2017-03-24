package java1702.javase.oop;

/**
 * Created by lichengjun on 2017/3/18.
 */
public class A3 {
    private int length;
    private int width;
    private int hypotenuse;

    public A3(int length, int width,int hypotenuse) {
        this.length = length;
        this.width = width;
        this.hypotenuse = hypotenuse;

    }

    public int getLength() {

        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public int getHypotenuse() {
        return hypotenuse;
    }

    public void setHypotenuse(int hypotenuse) {
        this.hypotenuse = hypotenuse;
    }



    public int Area() {
        return length * width /2;
    }

    public static void main(String[] args) {
        A3 a3 = new A3(4,3,5);
        System.out.println(a3.Area());
        System.out.println(a3.Perimeter());
    }
    public int Perimeter() {
        return length + width + hypotenuse;
    }
}
