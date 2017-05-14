package java1702.javase.reflect;

import java.util.Queue;
import java.util.Stack;

/**
 * Created by Li chengjun
 * on 2017/5/13 10:41.
 */
//编写一个程序，开启3个线程，这3个线程的 Name 分别为 A、B、C，每个线程将自己的 Name 在屏幕上打印10遍，要求输出结果必须按
// ABC 的顺序显示；如：ABCABC….依次递推 15分

public class T7 {
    private static final int MAX_TASK_NUMBER = 3;

    public static void main(String[] args) {
        PrintTask printTask = new PrintTask(MAX_TASK_NUMBER, 10);
        Thread t1 = new Thread(printTask);
        Thread t2 = new Thread(printTask);
        Thread t3 = new Thread(printTask);
        t1.setName("A");
        t2.setName("B");
        t3.setName("C");
        t1.start();
        t2.start();
        t3.start();
    }

}

class PrintTask implements Runnable {
    private int taskNum;
    private int count = 0;
    private int cycleTimes;
    private int id;

    PrintTask(int taskNum, int cycleTimes) {
        this.taskNum = taskNum;
        this.cycleTimes = cycleTimes;
    }

    @Override
    public void run() {
        synchronized (this) {
            try {
                String name = Thread.currentThread().getName();
                while (true) {

                    id = count % taskNum;
                    switch (name) {
                        case "A":
                            while (id != 0) {
                                wait();
                            }
                            break;

                        case "B":
                            while (id != 1) {
                                wait();
                            }

                            break;
                        case "C":
                            while (id != 2) {
                                wait();
                            }
                            break;

                        default:
                            break;
                    }
                    count++;
                    if (count > cycleTimes * taskNum) {
                        Thread.currentThread().interrupt();
                    } else {
                        System.out.print(name);
                    }

                    notifyAll();
                }
            } catch (InterruptedException e) {
            }
        }
    }
}
