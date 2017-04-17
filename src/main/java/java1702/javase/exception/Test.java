package java1702.javase.exception;

/**
 * Created by Li chengjun
 * on 2017/4/17 9:08.
 */
public class Test {
    public static void main(String[] args) {

        // 0 不能作为除数  java.lang.ArithmeticException 算术异常
        System.out.println(1/1);

        String s = "123";
        s="hi"; // java.lang.NullPointerException  空指针异常
        System.out.println(s.toLowerCase());

        try {
        //java.lang.StringIndexOutOfBoundsException 抛出字符串下标越界异常
        System.out.println("hello".charAt(4));

        //java.lang.ArrayIndexOutOfBoundsException 数组下标越界异常
        System.out.println(new int[]{1,2,3}[-1]);

        }catch (ArrayIndexOutOfBoundsException e){

        }


    }
}
