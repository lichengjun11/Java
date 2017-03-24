package java1702.javase.basic;

/**
 * Created by lichengjun on 2017/3/8.
 */
public class MiscOperators {
    public static void main(String[] args) {

        int grade = 68;
        if (grade > 60) {
            System.out.println("良好");
        } else if (grade <= 60) {
            System.out.println("不及格");
        } else if (grade == 70) {
            System.out.println("还行");
        }
    }
}