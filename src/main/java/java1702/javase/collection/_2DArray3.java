package java1702.javase.collection;

import java.util.Arrays;

/**
 * Created by Li chengjun
 * on 2017/4/7 11:03.
 */
public class _2DArray3 {
    public static void main(String[] args) {
        int[][] ints = new int[3][3];
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                ints[i][j] = i+j;
                System.out.print(ints[i][j]+ "\t");  //以表格形式输出
            }
            System.out.println();// 以表格形式输出
        }
//                System.out.println(ints[ints.length-1][ints[ints.length-1].length-1]);//输出最后一个数
//        System.out.println(Arrays.toString(new int[]{100,345}));
//        System.out.println(Arrays.deepToString(ints));

            }

        }


