package java1702.javase.exercise;

/**
 * Created by lichengjun on 2017/3/16.
 */
//利用递归方法求5！= 5 * 4 * 3 * 2 * 1==5*(5-1)!
public class E22 {
public int get(int n) {
    if (n == 1) {
        return 1;
    } else {
        return n * get(n-1);
    }

}

    public static void main(String[] args) {
        E22 e22 = new E22();
        System.out.println(e22.get(5));
    }











//    public int get(int n ) {
//        if (n==1) {
//            return 1;
//        } else {
//            return n*get(n-1);
//        }
//    }
//    public static void main(String[] args) {
//        java1702.javase.exercise.E22 e22 = new java1702.javase.exercise.E22();
//        System.out.println(e22.get(5));
//    }

}