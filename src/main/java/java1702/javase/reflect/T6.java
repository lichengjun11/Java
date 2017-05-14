package java1702.javase.reflect;

/**
 * Created by Li chengjun
 * on 2017/5/13 9:35.
 */
//编写一个程序，子线程循环 10 次，接着主线程循环 100 次，接着又回到子线程循环 10 次，
// 接着再回到主线程又循环 100 次，如此循环
public class T6  {
    synchronized void waitTest(){

    }

    }
class T6Test implements Runnable{
    public static void main(String[] args) {
        Thread thread = new Thread(new T6Test(),"thread1");
        thread.start();
        Thread thread2 = new Thread(new T6Test(),"thread2");
        thread2.start();
    }
    private static T6 t6 = new T6();
    @Override
    public void run() {

    }
}