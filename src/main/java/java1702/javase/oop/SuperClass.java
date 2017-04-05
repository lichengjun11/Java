package java1702.javase.oop;

/**
 * Created by Li chengjun
 * on 2017/4/5 9:26.
 */
public class SuperClass {

    int i;
    public SuperClass(){

    }
    public SuperClass(int i) {
        this.i = i;
        System.out.println("in super class constructor...");
    }
    public void method() {
        System.out.println("method...");
    }
}

class SubClass extends SuperClass {
    private boolean b;
    public SubClass() {
        super();
        System.out.println("in sub class constructor...");
    }
    public void m() {
        System.out.println("m...");
    }
}

class Test1 {
    public static void main(String[] args) {
        SubClass subClass = new SubClass();
//        System.out.println(subClass.i);
        SuperClass superClass = new SuperClass(3);
        superClass.method();
    }
}