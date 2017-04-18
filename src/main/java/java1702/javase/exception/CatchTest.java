package java1702.javase.exception;

/**
 * Created by Li chengjun
 * on 2017/4/17 9:59.
 */
public class CatchTest {
    public static void main(String[] args) {
        try {
            System.out.println(1 / 0);
            System.out.println("hello".charAt(6));
            System.out.println();
        } catch (ArithmeticException e) {
            e.printStackTrace();// 输出异常
//        System.exit(1); // 退出程序
        } catch (StringIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("finally..");// 不管什么情况下，finally始终会被输出
        }
        System.out.println("test");
        System.err.println("异常处理。");
    }
}


