package java1702.javase.basic;

/**
 * Created by Li chengjun
 * on 2017/3/21 10:45.
 */
public interface Shape {
    int ONE = 345;
}
    interface Perimeter {
        public void k();

   public  double Perimeter();
   public  double Area();
}

class Circle implements Shape,Perimeter {
    private double pi = 3.14;
    private double radius;



    public static void main(String[] args) {
        System.out.println(ONE);
    }

    @Override
    public void k() {
        System.out.println("very good");
    }

    @Override
    public double Perimeter() {
        return 443d;
    }

    @Override
    public double Area() {
        return 0;
    }
}
