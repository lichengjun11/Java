package java1702.javase.multithreafing;

/**
 * Created by Li chengjun
 * on 2017/5/8 21:48.
 */
public class JoinTest implements Runnable{
    public static void main(String[] args) {
        Thread thread = new Thread(new JoinTest());
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("hello!");
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
