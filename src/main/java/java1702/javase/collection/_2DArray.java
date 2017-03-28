package java1702.javase.collection;

/**
 * Created by Li chengjun
 * on 2017/3/28 9:14.
 */
public class _2DArray {
    public static void main(String[] args) {

//        int[][] ints = new int[8][9];
//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 9; j++) {
//                ints[i][j] = i + j;
//                System.out.print(ints[i][j] + "\t");
//            }
//            System.out.println();
//        }

        int[][] ints = new int[5][7];
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                ints[i][j] = i + j;
                System.out.println(ints[i] + "\t");
            }
        }
        String[][] strings = new String[4][];
        strings[0] = new String[5];
        strings[1] = new String[1];
        strings[2] = new String[3];
        strings[3] = new String[4];

        double[][] doubles =
                {
                        {1d,2d,3d,4d},
                        {1d},
                        {1d,2d},
                        {1d,2d,3d},

                };
        for (int i = 0; i < doubles.length; i++) {
            for (int j = 0; j < doubles[i].length; j++) {
                System.out.println(doubles[i] + "\t");
            }
            System.out.println();
        }

    }
}
