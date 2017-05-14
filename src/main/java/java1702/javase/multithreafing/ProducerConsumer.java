package java1702.javase.multithreafing;

import java.util.Stack;

/**
 * Created by Li chengjun
 * on 2017/5/12 22:09.
 */
public class ProducerConsumer {
    public static void main(String[] args) {

    }
}

class Producer implements Runnable{
    private static final int MAX = 10;
    private Stack<Integer> stack;
    private static int data;

    public Producer(Stack<Integer> stack) {
        this.stack = stack;
    }

    @Override
    public void run() {
        synchronized (stack){
            if(stack.size() == MAX){
                try {
                    stack.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int i = 0; i < MAX; i++) {
                    stack.push(data++);
                }
                stack.notify();
            }
        }
    }
}

class Consumer implements Runnable{
    private Stack<Integer> stack;
    public Consumer(Stack<Integer> stack) {
        this.stack = stack;
    }


    @Override
    public void run() {

    }
}