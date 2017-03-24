package java1702.javase.oop;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;

/**
 * Created by Li chengjun
 * on 2017/3/21 8:45.
 */
public abstract class Abstract {//抽像类 ，可以修饰类和方法   modifier修饰符
 private int i;
 public abstract void method();
 public abstract void method1();
 public abstract void method2();
 public abstract String method (int i,double b ,boolean d);

    public static void main(String[] args) {
        SubAbstract subAbstract = new SubAbstract();
        System.out.println(subAbstract);
        subAbstract.method1();
        subAbstract.method2();
    }
}

class SubAbstract extends Abstract {

    @Override
    public void method() {

    }

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public String method(int i, double b, boolean d) {
        return null;
    }
}