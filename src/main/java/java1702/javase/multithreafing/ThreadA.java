package java1702.javase.multithreafing;


/**
 * Created by lichengjun on 2017/7/18.
 */
public class ThreadA implements Runnable {
   private Data data;
    public ThreadA(Data data){
        this.data = data;
    }
    @Override
    public void run() {
            try {
        while (true){
                Thread.sleep(2000);

            }
        } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
}
