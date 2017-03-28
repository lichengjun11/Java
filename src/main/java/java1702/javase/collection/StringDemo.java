package java1702.javase.collection;

/**
 * Created by Li chengjun
 * on 2017/3/28 15:20.
 */
public class StringDemo {
    public static void main(String[] args) {
      String s = "hello";
      String s1 = "qwer";
      char[] chars = {'h','i'};
      String s2 = new String(chars);
        System.out.println(s2);//字符向字符串的转换


        for (char c : s2.toCharArray()) {
            System.out.println(c);
            //toCharArray()
            //将此字符串转换为一个新的字符数组。
        }
        String s3 = "Hello";
        System.out.println(s3.toLowerCase());//输出的全部小写
        System.out.println(s3.toUpperCase());//输出的全部大写

        String str = new String(chars);
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());



    }
}
