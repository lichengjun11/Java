package java1702.javase.exercise;

/**
 * Created by Li chengjun
 * on 2017/3/30 9:04.
 */

//杨辉三角形
public class E33 {
    public static void main(String[] args) {
        int[] array1 = {1};
        int[] array2 = {1,1};
        int[] array3 = {1,2,1};
        int[] array4 = {1,3,3,1};
        int[] array5 = {1,4,6,4,1};
        int[] array6 = {1,5,10,10,5,1};
        int[] array7 = new int[7];
        for (int i = 0; i < array7.length; i++) {
            if (i == 0 || i == array7.length-1) {
                array7[i] = 1;
            } else {
                array7[i] = array6[i-1] + array6[i];
            }

        }
        for (int i : array7) {
            System.out.println(i);
        }
        //i 代表行
            // i 代表列数

            }//假如i = 2，第五行的第二列 = 第四行第二列的前一列数+ 第四行的第二列的数字
        }  // i- 1 代表第几列的前一列数字
//        for (int i : array7) {
//            System.out.println(i);
//        }
//    }
//}
