package java1702.javase.collection;

/**
 * Created by Li chengjun
 * on 2017/4/9 11:18.
 */
public class Game1 {
    private static final char[] COLOR = new char[]{'红', '黄', '蓝', '绿', '青', '紫'};
    public static void main(String[] args) {
        char[][] chars = new char[10][10];
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[i].length; j++) {
                chars[i][j] = COLOR[(int)(Math.random()*6)];
                System.out.print(chars[i][j]+ "\t");
            }
            System.out.println();
        }
    }
}
