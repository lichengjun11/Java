package java1702.javase.multithreafing;

/**
 * Created by Li chengjun
 * on 2017/5/13 10:03.
 */

public class WaitNotify {

    private Object object;

    public WaitNotify(Object object) {
        this.object = object;
    }

    public void waitMethod() {
        synchronized (object) {
            try {
                System.out.println(Thread.currentThread().getName() + " wait 1...");
                object.wait();
                System.out.println(Thread.currentThread().getName() + " wait 2...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void notifyMethod() {
        synchronized (object) {
            System.out.println(Thread.currentThread().getName() + " notify 1...");
            object.notify();
            System.out.println(Thread.currentThread().getName() + " notify 2...");
        }
    }
}

class WaitNotifyTest implements Runnable {

    private static WaitNotify waitNotify;

    @Override
    public void run() {
        waitNotify = new WaitNotify(new Object());
        if (Thread.currentThread().getName().equals("wait thread")) {
            waitNotify.waitMethod();
        }
        if (Thread.currentThread().getName().equals("notify thread")) {
            waitNotify.notifyMethod();
        }
    }

    public static void main(String[] args) {
        Thread waitThread = new Thread(new WaitNotifyTest(), "wait thread");
        waitThread.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread notifyThread = new Thread(new WaitNotifyTest(), "notify thread");
        notifyThread.start();
    }
}