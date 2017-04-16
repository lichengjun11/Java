package java1702.javase.generic;

/**
 * Created by Li chengjun
 * on 2017/4/16 21:27.
 */
public class Point {
    public Object getX() {
        return x;
    }

    public void setX(Object x) {
        this.x = x;
    }

    public Object getY() {
        return y;
    }

    public void setY(Object y) {
        this.y = y;
    }

    private Object x;
    private Object y;
}

class GenericsDemo01 {
    public static void main(String[] args) {
        Point p = new Point();
        p.setX(10);
        p.setY(20);
        int x = (Integer)p.getX();
        int y = (Integer)p.getY();
        System.out.println("x坐标为"+x);
        System.out.println("y坐标为"+y);
    }
}
