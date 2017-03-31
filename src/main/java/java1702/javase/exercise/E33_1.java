package java1702.javase.exercise;

/**
 * Created by Li chengjun
 * on 2017/3/30 20:03.
 */
public class E33_1 {
    public static void main(String[] args) {
        int n = 30;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n -1) - i; j++) {
                System.out.print(" ");
            }
            for (int j : getArray(i + 1)) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private static int[] getArray(int n) {
        if (n == 1) {
            return new int[]{1}; //  {1, 2, 3} [1, 2, 3] Arrays.toString(ints);
        } else {
            int[] array = new int[n];
            for (int i = 0; i < array.length; i++) {
                if (i == 0 || i == array.length - 1) {
                    array[i] = 1;
                } else {
                    array[i] = getArray(n - 1)[i - 1] + getArray(n - 1)[i];
                }
            }
            return array;
        }
    }
}