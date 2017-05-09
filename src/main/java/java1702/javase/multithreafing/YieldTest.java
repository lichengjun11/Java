package java1702.javase.multithreafing;

/**
 * Created by Li chengjun
 * on 2017/5/9 9:14.
 */
public class YieldTest implements Runnable{
    public static void main(String[] args) {
    Thread thread1 = new Thread(new YieldTest(),"thread1");
    Thread thread2 = new Thread(new YieldTest(),"thread2");

        thread1.start();
        thread2.start();
        System.out.println("Hello");
    }




    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i + Thread.currentThread().getName() + "is running....");
            if (i % 10 == 0) {
                Thread.yield();   //  让步
            }
        }
    }
}
