package java1702.javase.multithreafing;

import java.util.Stack;

/**
 * Created by Li chengjun
 * on 2017/5/12 21:35.
 */
public class StackTest {
    public static void main(String[] args) {
         //  Stack  堆栈  LIFO   last  in  first  out  后进先出
        //  queue   队列  FIFO   first  in first  out  先进先出
        Stack<String> strings = new Stack<>();
        strings.push("hi");  //  push  推
        strings.push("test");
        strings.push("hello");

        System.out.println(strings.pop());  // pop 弹出
        System.out.println(strings.pop());
        System.out.println(strings.pop());
    }
}
