package java1702.javase.collection;

import java.util.Arrays;

/**
 * Created by Li chengjun
 * on 2017/4/7 11:03.
 */
public class _2DArray3 {
    public static void main(String[] args) {
        String[][] strings = new String[4][6];
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                strings[i][j] = i * j + "";
            }
        }
                System.out.println(strings[strings.length-1][strings[strings.length-1].length-1]);//输出最后一个数
        System.out.println(Arrays.toString(new int[]{100,345}));
        System.out.println(Arrays.deepToString(strings));
            }

        }


