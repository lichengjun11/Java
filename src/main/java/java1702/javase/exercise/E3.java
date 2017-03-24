package java1702.javase.exercise;

/**
 * Created by lichengjun on 2017/3/14.
 */
public class E3 {
    public static void main(String[] args) {
        for (int i = 1000; i <100000 ; i++) {
            int wan = i/10000 ;
                int qian = i/1000%10;

                int bai = i/100%10;
                int shi = i/10%10;
                int ge =i%10 ;
            if (i== wan*wan*wan*wan+qian * qian * qian * qian + bai * bai * bai * bai + shi * shi * shi * shi + ge * ge * ge * ge) {

                System.out.println(i);
            }
            }



    }

}
