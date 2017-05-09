package java1702.javase.multithreafing;

/**
 * Created by Li chengjun
 * on 2017/5/9 9:38.
 */
//  priority  优先级
public class ThreadPriority implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {

        System.out.println(Thread.currentThread().getName()+":::"+"thread priority:" + Thread.currentThread().getPriority());

        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new ThreadPriority(),"thread1");
        Thread thread2 = new Thread(new ThreadPriority(),"thread2");
        Thread thread3 = new Thread(new ThreadPriority(),"thread3");
        thread1.setPriority(1);   //Thread.MIN_PRIORITY
        thread2.setPriority(1);   //Thread.MAX_PRIORITY
        thread3.setPriority(10);  //Thread.NORM_PRIORITY
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
