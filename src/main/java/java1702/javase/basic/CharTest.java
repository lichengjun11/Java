package java1702.javase.basic;

/**
 * Created by lichengjun on 2017/3/7.
 */
public class CharTest {
    public static void main(String[] args) {
        char c1=123;
        System.out.println(c1);

        char c2='中';
        System.out.println(c2);

        char c3='\123';
        System.out.println(c3);
        char c4='\u9fbb';//0-9 a-f [4E00,9FBB]
        System.out.println(c4);
        int m = 100;
        int n = 200;
        System.out.println(m % n);
        int x = 1;
        int y = 2;
        System.out.println(x==y);

       String s1 = "h1";

    }
}
