package java1702.javase.reflect;

/**
 * Created by Li chengjun
 * on 2017/5/13 8:41.
 */
// 使用 Runnable 接口实现多线程 10分
public class T2 implements Runnable{
    public static void main(String[] args) {

    Thread thread = new Thread(new T2(),"threadA");
    thread.start();
    Thread thread2 = new Thread(new T2(),"threadB");
    thread2.start();
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}
