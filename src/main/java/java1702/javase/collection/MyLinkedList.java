package java1702.javase.collection;

/**
 * Created by Li chengjun
 * on 2017/4/11 10:40.
 */
// 模仿LinkedList的内部实现
public class MyLinkedList {

    private class Node {
        String element;  //  element 元素
        Node prev;   // previous 以前的
        Node next;  // 下一个

        public Node(String element, Node prev, Node next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }
    }
}