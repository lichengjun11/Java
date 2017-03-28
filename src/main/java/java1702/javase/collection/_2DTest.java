package java1702.javase.collection;

/**
 * Created by Li chengjun
 * on 2017/3/28 10:05.
 */
public class _2DTest {
private static final String[] COLOR = {"红","黄","绿","青","蓝"};
    public static void main(String[] args) {
        String[][] string1 = new String[10][10];
        for (int i = 0; i < string1.length; i++) {
            for (int j = 0; j < string1[i].length; j++) {
                string1[i][j] = COLOR[(int)(Math.random()*5)];//产生随机数
                System.out.print(string1[i][j] +"\t");
            }

            System.out.println();
        }

    }
}
