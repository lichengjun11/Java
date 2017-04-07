package java1702.javase.collection;

/**
 * Created by Li chengjun
 * on 2017/4/7 11:03.
 */
public class _2DArray3 {
    public static void main(String[] args) {
        String[][] strings = new String[5][6];
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                strings[i][j] = i * j +"";
                System.out.println(strings[strings.length-1][strings[strings.length-1].length-1]);
            }
        }

            }

        }


