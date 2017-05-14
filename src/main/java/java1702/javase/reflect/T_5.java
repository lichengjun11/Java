package java1702.javase.reflect;

/**
 * Created by Li chengjun
 * on 2017/5/13 9:19.
 */
// 使用 wait 方法实现一次阻塞 10分
public class T_5 {
   synchronized void waitTest(){
       System.out.println(Thread.currentThread().getName() + " wait start ");
       try {
           this.wait();
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
   }


}
class T5Test implements Runnable{
    private static T_5 t5 = new T_5();
    @Override
    public void run() {
        t5.waitTest();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(new T5Test());
            thread.start();
        }
    }
}
