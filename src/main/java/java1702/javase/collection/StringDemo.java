package java1702.javase.collection;

/**
 * Created by Li chengjun
 * on 2017/3/28 15:20.
 */
public class StringDemo {

    public static void main(String[] args) {
    String s = "hellolichengjun";
    String s1 = new String("nihao");

      
    char[] chars = {'h','e','l','l','o'};
    String s2 = new String(chars);
        System.out.println(s2);//字符向字符串的转换


        for (char c : s2.toCharArray()) {
            System.out.println(c);
            //toCharArray()
            //将此字符串转换为一个新的字符数组。
        }



        String str = new String(s);
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        String s4 = "альянскийитальянскийитальянски";
      System.out.println(s4.charAt(s4.length()-2));

      String s5 = "niffffffjvscc";
      System.out.println(s5.charAt(s5.length()-1));
        String s3 = "hello";
      System.out.println(s3.contains("p"));
      System.out.println(s3.endsWith("l"));
    }
//    private static String toLowerCase(String src) {
//
//    }
}
