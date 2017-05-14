package java1702.javase.reflect;

/**
 * Created by Li chengjun
 * on 2017/5/13 9:06.
 */
//使用 join 方法实现一次阻塞 10分
public class T4 implements Runnable{
    public static void main(String[] args) {
        Thread thread1 = new Thread(new T4(),"thread 1");
        thread1.start();
        Thread thread2 = new Thread(new T4(),"thread 2");
        thread2.start();
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("join  阻塞");

    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + "is running.....");
        }
    }
}
