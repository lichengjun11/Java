package java1702.javase.oop;

import java1702.javase.basic.For;
import sun.text.resources.cldr.ia.FormatData_ia;

/**
 * Created by Li chengjun
 * on 2017/3/27 20:18.
 */
public class Boxing {
    public static void main(String[] args) {
    long sum = 0L;
    long start = System.currentTimeMillis();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println("time:" + (System.currentTimeMillis()- start)/1000   );
        System.out.println("sum:"+ sum);
    }

}
