package java1702.javase.test;

/**
 * Created by Li chengjun
 * on 2017/5/11 14:33.
 */
// 写出一个程序，接受一个浮点数值，输出该数值的近似整数值
    // 如果小数点后数值大于等于5，向上取整；小于5，向下取整
    // 例如：-4.5 四舍五入的结果是-4
    // 4.4 四舍五入的结果是4
public class T5 {
    public static void main(String[] args) {
        double d1 = -4.5;
        double d2 = 4.4;
        int i1 = (int)d1;
        int i2 = (int)d2;
        //  简便方法
        System.out.println(Math.round(d1));
        System.out.println(Math.round(d2));

    // 复杂方法
        if(d1-i1<=-0.5){
            System.out.println(i1-1);
        }else {
            System.out.println(i1);
        }

        if (d2 -i2 < 0.5) {
            System.out.println(i2);
        } else {
            System.out.println(i2 + 1);
        }
    }
}
