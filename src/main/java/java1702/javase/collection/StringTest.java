package java1702.javase.collection;

/**
 * Created by Li chengjun
 * on 2017/3/29 8:58.
 */
public class StringTest {
    public static void main(String[] args) {
        String s = "    hello world  sfvb    ";
        System.out.println(s.matches("\\w+"));
        System.out.println(s.contains("d"));
        System.out.println(s.equals("hello"));

        System.out.println(s.replace('l','a'));
        System.out.println(s.replaceAll("\\w+","a"));
        System.out.println(s.replaceFirst("o","d"));

        String [] strings = s.split("\\s+");
        System.out.println(strings.length);
        for (String string : strings) {
            System.out.println(string);

            System.out.println(s.substring(6,11));
            System.out.println(s.substring(s.indexOf("w"),s.indexOf("w")+5));
            System.out.println(s.substring(s.indexOf('w')));
            System.out.println(s.trim());

            System.out.println(string.valueOf(true));

            String s1 = "hello";
            String s2 = new String(s1);
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1.equals(s2));
        }
    }
}
