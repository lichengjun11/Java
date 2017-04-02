package java1702.javase.collection;

/**
 * Created by Li chengjun
 * on 2017/4/2 17:37.
 */
public class _2DArray1 {
    public static void main(String[] args) {
        String[][] strings = {{"小李","小张","小菜","小五"},{"小孙","小董","小安","小江"}};
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                System.out.print(strings[i][j]+" ");

            }
            System.out.println();

        }
    }
}
