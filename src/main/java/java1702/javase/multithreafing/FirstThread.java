package java1702.javase.multithreafing;

/**
 * Created by Li chengjun
 * on 2017/5/8 11:27.
 */
public class FirstThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName()+""+i);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i + "test");
        }
        new FirstThread().start();
    }
}
