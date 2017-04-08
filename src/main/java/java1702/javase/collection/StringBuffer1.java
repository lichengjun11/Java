package java1702.javase.collection;

/**
 * Created by Li chengjun
 * on 2017/4/8 9:02.
 */
public class StringBuffer1 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("hello");
        stringBuffer.append(" world");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.append("world"));  //  append 追加
        System.out.println(stringBuffer.delete(6,11));      // delete  删除
        System.out.println(stringBuffer.insert(6," :"));    // insert 插入， 写入
        System.out.println(stringBuffer.reverse());     // reverse  颠倒
        stringBuffer.reverse().setCharAt(0,'H');// setCharAt  前面写索引 后面写字符
        System.out.println(stringBuffer);
    }
}
