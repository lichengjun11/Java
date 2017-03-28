package java1702.javase.collection;

/**
 * Created by Li chengjun
 * on 2017/3/28 9:14.
 */
public class _2DArray {
    public static void main(String[] args) {
        int[][] ints = new int[8][9];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 9; j++) {
                ints[i][j] = i + j;
                System.out.print(ints[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
