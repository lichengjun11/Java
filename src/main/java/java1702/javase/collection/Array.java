package java1702.javase.collection;

/**
 * Created by Li chengjun
 * on 2017/3/27 15:21.
 */
public class Array {
    public static void main(String[] args) {
        String[] strings = new String[5];
        strings[0] = "good 0";
        strings[1] = "good 1";
        strings[2] = "good 2";
        strings[3] = "good 3";
        strings[4] = "very 4";
        System.out.println(strings[3]);

        boolean[] booleans = new boolean[345];
        booleans[0] = true;
        System.out.println(booleans[0]);

        int[] ints = {12,23,23,43,54,6,76,565,4,43,23};
        System.out.println(ints[5]);
        
        double[] doubles = new double[100];
        for (int i = 0; i <= doubles.length; i++) {
            System.out.println(i);
            
        }

    }
}
