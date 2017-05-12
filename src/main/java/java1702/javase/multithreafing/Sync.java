package java1702.javase.multithreafing;

/**
 * Created by Li chengjun
 * on 2017/5/12 15:22.
 */
public class Sync {
    synchronized void waitTest(){
        System.out.println(Thread.currentThread().getName() + "wait start...");
        try {
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " wait end.....");
    }
    synchronized void notifyTest(){
        System.out.println(Thread.currentThread().getName() + " notify start ");
        this.notifyAll();
        System.out.println(Thread.currentThread().getName() + " notify end  ");
    }
}

class SyncTest implements Runnable{
    private static Sync sync = new Sync();
    @Override
    public void run() {
        if(Thread.currentThread().getName().endsWith("5")){
            sync.notifyTest();
            return;
        }
        sync.waitTest();
    }

    public static void main(String[] args) {
        SyncTest syncTest = new SyncTest();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(syncTest,"thread"+i);
            thread.start();
        }
    }
}