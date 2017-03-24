package java1702.javase.basic;

/**
 * Created by lichengjun on 2017/3/17.
 */
public class StaticPolymorphism {
}
class CalculatorTest {
    public double add(double x,double y) {
        return x+y;
    }
    public int add(int a, int b) {
        return a * b;
    }
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        System.out.println(calculatorTest.add(1.3,2));
    }
}

