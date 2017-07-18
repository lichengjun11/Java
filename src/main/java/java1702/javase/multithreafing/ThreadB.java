package java1702.javase.multithreafing;


/**
 * Created by lichengjun on 2017/7/18.
 */
public class ThreadB implements Runnable {
   private Data data;
    public ThreadB(Data data){
        this.data = data;
    }
    @Override
    public void run() {
            try {
                 while (true){
                Thread.sleep(2000);
                data.methodB();

            }
        } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
}
