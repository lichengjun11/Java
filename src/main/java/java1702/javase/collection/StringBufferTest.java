package java1702.javase.collection;

/**
 * Created by Li chengjun
 * on 2017/3/29 14:01.
 */
public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        System.out.println(stringBuffer);

        String s = "hello";
        StringBuffer stringBuffer1 = new StringBuffer(s);  // 将一个字符串转换为字符串缓冲区
        System.out.println(stringBuffer1);
        String s1 = stringBuffer1.toString();
        System.out.println(s1);
        System.out.println(stringBuffer.append(true).append(123));  // 追加， 可以连续追加
    }
}
