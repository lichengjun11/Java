package java1702.javase.collection;

/**
 * Created by Li chengjun
 * on 2017/3/29 10:53.
 */
public class StringVsStringBufferTest {
    private static final String ALPHABET ="abcdefghijklmnopqistuvwxyz";
    public static void main(String[] args) {
        String s = "";
        StringBuffer stringBuffer = new StringBuffer("");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
//            s += ALPHABET;
//            StringBuffer.append(ALPHABET);
        }
        System.out.println("time:"+(System.currentTimeMillis()-start));
        System.out.println(s.length());
        System.out.println(stringBuffer.length());
    }
}
