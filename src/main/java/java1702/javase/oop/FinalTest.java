package java1702.javase.oop;

/**
 * Created by Li chengjun
 * on 2017/4/6 10:45.
 */
public final class FinalTest {
    private final int i;

    public FinalTest(int i) {
        this.i = i;
    }
    public FinalTest() {
        i = 1;
    }
   public final void m() {
        
   }

    public static void main(String[] args) {
        FinalTest finalTest = new FinalTest(5);
    }
}
