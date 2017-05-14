package java1702.javase.multithreafing;

/**
 * Created by Li chengjun
 * on 2017/5/9 9:14.
 */
public class YieldTest implements Runnable{
    public static void main(String[] args) {
        Thread thread = new Thread(new YieldTest(),"t1");
        Thread thread1 = new Thread(new YieldTest(),"t2");
        thread.start();
        thread1.start();
        System.out.println("test");
    }


    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i + ":"+ Thread.currentThread().getName());
            if (i % 20 ==0) {
                Thread.yield();
            }
        }

    }
}
