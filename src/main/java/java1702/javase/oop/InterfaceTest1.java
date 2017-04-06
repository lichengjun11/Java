package java1702.javase.oop;

/**
 * Created by Li chengjun
 * on 2017/4/6 15:34.
 */
//接口
public interface InterfaceTest1 extends A,S,C,D {
     int ZERO = 0;
     void method();
}

interface A {
    void a();
}
interface S {
    void b();
}
interface C {
    void c();
}
interface D {
    void d();
}

class InterfaceTestImpl implements InterfaceTest1 {

    @Override
    public void method() {
        System.out.println("大家好！");
    }

    @Override
    public void a() {

    }

    @Override
    public void b() {

    }

    @Override
    public void c() {

    }

    @Override
    public void d() {

    }
}

class T {
    public static void main(String[] args) {
        InterfaceTestImpl interfaceTest = new InterfaceTestImpl();
        interfaceTest.method();
    }
}
