package java1702.javase.collection;

/**
 * Created by Li chengjun
 * on 2017/4/2 19:34.
 */

//将矩阵进行转置运算
public class _2DArray2 {
    public static void main(String[] args) {
        int[][] ints = {{1,2,3},{4,5,6},{7,8,9}};// 创建二维数组
        System.out.println("转置前的矩阵是:");
        printArray(ints);
        int[][] ints1 = new int[ints.length][ints.length];
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                ints[i][j] = ints1[j][i];
            }
        }
        System.out.println();
        printArray(ints1);
    }

    private static void printArray(int[][] ints) {
    }
}
