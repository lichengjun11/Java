package java1702.javase.multithreafing;

/**
 * Created by lichengjun on 2017/7/18.
 */
public class Data {
    private int temp = -1;
    synchronized public void methodA(){
        temp++;
        System.out.println("temp:"+temp+"i am methodA\n");
    }
    synchronized public void methodB(){
        temp*=2;
        System.out.println("temp:"+temp+"i am methodB\n");
    }
}
