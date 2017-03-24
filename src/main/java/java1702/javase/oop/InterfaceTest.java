package java1702.javase.oop;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Li chengjun
 * on 2017/3/23 9:00.
 */
public interface InterfaceTest {
    public String AUTHOR = "李兴华";

    void print();

    public String getlnfo();
}

interface B {
    void say();
}

class X implements InterfaceTest, B {
    @Override
    public void print() {
        System.out.println("作者："+ AUTHOR);
    }

    @Override
    public String getlnfo() {
        return "HELLO";
    }

    @Override
    public void say() {
        System.out.println("Hello World!!!");
    }
}

class InterfaceDemo {
    public static void main(String[] args) {
        X x = new X();
        x.say();
        x.print();
    }
}


// int ONE = 345;
// void li();
//}
//
//interface A {
//    void a();
//}
//
//
//class InterfaceTestImpl implements InterfaceTest,A {
//
//    @Override
//    public void li() {
//
//    }
//
//    @Override
//    public void a() {
//
//    }


