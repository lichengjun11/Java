package java1702.javase.collection;

import sun.util.resources.cldr.ar.TimeZoneNames_ar;

import java.util.Arrays;

/**
 * Created by Li chengjun
 * on 2017/4/1 15:02.
 */
public class E4 {
    public static void main(String[] args) {
    int[] a = {89,90,77,87,66,54,328,890,99};
    int[] b = {65,72,12,77,2,96,54,27,89};
      int[] c = new int[3];
      int cc = 0;
        for (int j = 0; j < a.length; j++) {
            for (int k = 0; k < b.length; k++) {
                if (a[j] ==b[k]) {
                    c[cc] = a[j];
                    cc++;
                }

            }
            System.out.println(Arrays.toString(c));
        }
    }




}
