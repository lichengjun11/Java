package java1702.javase.exercise;

/**
 * Created by Li chengjun
 * on 2017/3/30 9:04.
 */


public class E33 {
    public static void main(String[] args) {
        int[] array1 = {1};
        int[] array2 = {1,1};
        int[] array3 = {1,2,1};
//        int[] array4 = {1,3,3,1};
        int[] array5 = {1,4,6,4,1};

            int[] array4 = new int[4];
        for (int i = 0; i < array4.length; i++) {
            if (i == 0||i == array4.length-1) {
                array4[i] = 1;
            } else {
                array4[i] = array3[i-1]+array3[i];
            }

        }
        for (int i : array4) {
            System.out.println(i);
        }
    }
}
