package java1702.javase.collection;

/**
 * Created by Li chengjun
 * on 2017/4/9 10:34.
 */
public class _2DArray4 {
    public static void main(String[] args) {
        int[][][] ints = new int[3][5][7];
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                for (int k = 0; k < ints[i][j].length; k++) {

                ints[i][j][k] = i + j + k;
                System.out.println(ints[i][j][k]+"   ");
                }
            }
//            System.out.println();
        }
        Double[][] doubles =
                {
                        {1d,2d,3d,4d,5d},
                        {1d,2d},
                        {1d,2d,3d},
                        {1d,2d,3d,4d}
                };
        for (int i = 0; i < doubles.length; i++) {
            for (int j = 0; j < doubles[i].length; j++) {
                System.out.print(doubles[i][j]+ "\t");
            }
            System.out.println();
        }
    }
}
