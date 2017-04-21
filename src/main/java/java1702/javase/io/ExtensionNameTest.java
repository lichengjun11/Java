package java1702.javase.io;

/**
 * Created by Li chengjun
 * on 2017/4/21 19:48.
 */
//  扩展名
public class ExtensionNameTest {
    public static void main(String[] args) {
        String s1 = "123.gif";
        System.out.println(s1.substring(s1.lastIndexOf('.')+1));  // 提取gif
    }
}
