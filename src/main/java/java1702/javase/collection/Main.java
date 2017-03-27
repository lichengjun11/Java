package java1702.javase.collection;

/**
 * Created by Li chengjun
 * on 2017/3/27 19:19.
 */
public class Main {
    public static void main(String[] args) {
        Foo f = new Foo("f");
        changeReference(f);
        modifyReference(f);
        System.out.println(f.s);
    }
    public static void changeReference(Foo a) {
        Foo b = new Foo("b");

        // 1: stack: b
        // 2: heap: object
        // 3: b ---> object

        a = b;
        System.out.println("-->" + a.s); //  b
    }

    public static void modifyReference(Foo c) {
        c.setAttribute("c");
    }
}

class Foo {
    public String s;

    public Foo(String s) {
        this.s = s;
    }

    public void setAttribute(String s) {
        this.s = s;
    }
}