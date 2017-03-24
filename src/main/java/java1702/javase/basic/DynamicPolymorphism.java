package java1702.javase.basic;

import java.util.Objects;

/**
 * Created by lichengjun on 2017/3/19.
 */
public class DynamicPolymorphism {
    public static void main(String[] args) {
    SuperClass superClass = new SuperClass();
        superClass.method();

        SubClass1 subClass1 = new SubClass1();
        subClass1.method();

    }
}

class SuperClass {

    public void method() {
        System.out.println("method in super class...");
    }
}

class SubClass1 extends SuperClass {
    public void method() {
        System.out.println("method in sub class...");
    }

}

class SubClass2 extends SuperClass {
    @Override
    public void method() {
        super.method();
    }
}