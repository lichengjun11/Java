package java1702.javase.collection;

/**
 * Created by Li chengjun
 * on 2017/3/28 10:05.
 */
public class _2DTest {

    public static void main(String[] args) {
        int[][] ints = new int[10][10];
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {

                System.out.print(ints[i][j] +"\t");
            }

            System.out.println();
        }

    }
}
