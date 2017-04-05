package java1702.javase.oop;

/**
 * Created by Li chengjun
 * on 2017/4/5 16:11.
 */
public class BaseClass {
    public int book = 6;
    public void base() {
        System.out.println("父类的普通方法");
    }
    public void test() {
        System.out.println("父类的被覆盖的方法");
    }
}

class SubClass2 extends BaseClass {
    public String book = "Hello";
    public void test() {
        System.out.println("子类覆盖父类的方法");
    }
    public void Sub() {
        System.out.println("子类的普通方法");
    }

    public static void main(String[] args) {
        BaseClass bc = new BaseClass();
        System.out.println(bc.book);
        bc.base();
        bc.test();

        SubClass2 sc = new SubClass2();
        System.out.println(sc.book);
        sc.test();
        sc.base();

        BaseClass ploymophicBc = new SubClass2();
        System.out.println(ploymophicBc.book);
        ploymophicBc.base();
        ploymophicBc.test();
    }
}
