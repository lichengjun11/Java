package java1702.javase.exercise;

/**
 * Created by lichengjun on 2017/3/14.
 */
public class E2 {
    public static void main(String[] args) {
        for (int i = 5; i <20 ; i++) {
           boolean b = true;
            for (int j = 2; j < i ; j++) {
                if (i % j == 0) {
                    b = false;
                    break;
                }
            }
            if ( b == true) {
                System.out.println(i);
            }

        }







//        for (int i = 100; i <201 ; i++) {
//            boolean b = true;// b: j  能否整除 i-> i 是否是素数
//            for (int j = 2; j < i ; j++) {
//                if (i % j == 0) {
//                    b = false;
//                }
//
//            }
//            if (b == true){
//                System.out.println(i);
//            }
//        }
    }
}
