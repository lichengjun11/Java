package java1702.javase.collection;

/**
 * Created by Li chengjun
 * on 2017/3/27 15:21.
 */
public class Array {
    public static void main(String[] args) {
        String[] strings;
        strings= new String[5];
        strings[0] = "test..";
        System.out.println(strings[2]);

        boolean[] booleans = new boolean[100];
        System.out.println(booleans[89]);

            int[] ints = {12,34,24,355,6577,789,567,666};
        System.out.println(ints[2]);

        double[] doubles = new double[19990];
        System.out.println(doubles.length);

        Array[] arrays = { new Array(),new Array(),new Array()};

        System.out.println(arrays[0]);
        System.out.println(arrays[1]);
        System.out.println(arrays[2]);

    }
}
