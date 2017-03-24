package java1702.javase.exercise;

/**
 * Created by lichengjun on 2017/3/16.
 */
//将一个正整数分解质因数。例如90=2*3*3*5；
public class E4 {
    public void get(int n) {
        for (int i = 2; i <n+1 ; i++) {
            if (n % i == 0) {
                if (i == n) {
                    System.out.println(i);
                }
            } else {
                System.out.println(i + "*");
                get(n / i);

            }
        }
    }



    public static void main(String[] args) {

    }
}
