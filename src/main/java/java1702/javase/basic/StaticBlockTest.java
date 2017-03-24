package java1702.javase.basic;

/**
 * Created by Li chengjun
 * on 2017/3/22 14:40.
 */
public class StaticBlockTest {
    private int i;
    private boolean b;

    public StaticBlockTest() {
        System.out.println("nihao");
    }

    static {
        System.out.println("static block...");
    }


    public void m() {

    }

    public static void main(String[] args) {

    StaticBlockTest staticBlockTest = new StaticBlockTest();
    StaticBlockTest staticBlockTest1 = new StaticBlockTest();
    StaticBlockTest staticBlockTest2 = new StaticBlockTest();
    StaticBlockTest staticBlockTest3 = new StaticBlockTest();
    StaticBlockTest staticBlockTest4 = new StaticBlockTest();
    }


}
