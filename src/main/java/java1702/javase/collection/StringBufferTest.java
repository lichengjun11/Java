package java1702.javase.collection;

/**
 * Created by Li chengjun
 * on 2017/3/29 14:01.
 */
public class StringBufferTest {
    public static void main(String[] args) {
        //java.lang stringbuffer
        //buffer  缓冲
        StringBuffer stringBuffer = new StringBuffer();
        System.out.println(stringBuffer);
        String s1 = "hello";
        StringBuffer stringBuffer1 = new StringBuffer(s1);
    }   //append 附加
}
