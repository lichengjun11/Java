package java1702.javase.multithreafing;

/**
 * Created by Li chengjun
 * on 2017/5/8 22:13.
 */
public class MT5 implements Runnable{
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MT5());
        thread1.setName("thread1");
        Thread thread2 = new Thread(new MT5());
        thread2.setName("thread2");
        Thread thread3 = new Thread(new MT5());
        thread3.setName("thread3");
        thread1.start();
        thread2.start();
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread3.start();
        System.out.println("hello world!");
    }



    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + "is running....");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
