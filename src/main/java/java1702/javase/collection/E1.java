package java1702.javase.collection;

/**
 * Created by Li chengjun
 * on 2017/4/1 13:45.
 */
public class E1 {
    public static void main(String[] args) {
        int[][] ints = new int[4][4];
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                System.out.print(ints[i][j]+"\t");
            }
            System.out.println();
        }


    }
}
