package java1702.javase.reflect;

/**
 * Created by Li chengjun
 * on 2017/5/13 8:56.
 */
//使用 sleep 方法实现一次阻塞 10分
public class T3 implements Runnable{
    public static void main(String[] args) {
        Thread thread1 = new Thread(new T3());
        thread1.start();
        Thread thread2 = new Thread(new T3());
        thread2.start();
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
