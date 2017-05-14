package java1702.javase.reflect;

/**
 * Created by Li chengjun
 * on 2017/5/13 8:52.
 */
// 使用 Thread 类实现多线程 10分
public class T1 extends Thread{
    public static void main(String[] args) {
        T1 t1 = new T1();
       t1.start();
        System.out.println("hello");

    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}
