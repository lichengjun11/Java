package java1702.javase.oop;

/**
 * Created by Li chengjun
 * on 2017/4/6 9:13.
 */
public abstract class AbstractTest {
    public AbstractTest(int i) {
        this.i = i;
    }

    private int i;
    public abstract void method(String s);

    public static void main(String[] args) {
        SubAbstractTest subAbstractTest = new SubAbstractTest(5);
    }
}

class SubAbstractTest extends AbstractTest {

    public SubAbstractTest(int i) {
        super(i);
    }

    @Override
    public void method(String s) {

    }


}
