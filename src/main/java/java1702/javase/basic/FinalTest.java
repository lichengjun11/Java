package java1702.javase.basic;

/**
 * Created by Li chengjun
 * on 2017/3/21 14:02.
 */  // final  最后的，最终的
public class FinalTest {
    public static void main(String[] args) {
        for (int i = 1; i <=9; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i+"*"+j+"="+i*j+"\t");
            }
        System.out.println();
        }
    }

}
