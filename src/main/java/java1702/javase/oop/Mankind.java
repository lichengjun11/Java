package java1702.javase.oop;

/**
 * Created by Li chengjun
 * on 2017/4/6 14:06.
 */
public class Mankind {
    private static final int ONE_TWO_THREE = 123;//常量

    public Mankind(String name) {
        System.out.println(name);
    }
    static{
        System.out.println("static block...");
    }
   static String name;
    static String earth;
}
class newTest{
    private  int i;

    public static void main(String[] args) {
        newTest newTest = new newTest();
        newTest.i = 456;
        boolean b;
        Mankind tom = new Mankind("Tom");
        Mankind.name = "Tom";
        Mankind.earth= "Tom种了一棵树";
        System.out.println(Mankind.name);
        System.out.println(Mankind.earth);

        Mankind jerry = new Mankind("Jerry");
        Mankind.name = "Jerry";
//        Mankind.earth ="Jerry 没有种树";
        System.out.println(Mankind.earth);

        System.out.println(Math.pow(2,31));

    }
}