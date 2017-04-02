package java1702.javase.collection;

/**
 * Created by Li chengjun
 * on 2017/4/2 16:54.
 */

//求数组中最小的元素，并在控制台输出
public class MinNum {
    public static void main(String[] args) {
        int[] num = {3,55,4,78,655,666,-1};//创建并初始化一维数组num
        System.out.println("输出一维数组：");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");//输出一维数组
        }
        int min = num[0];
        for (int i = 0; i < num.length - 1; i++) {  // 通过for循环遍历数组
            if (min > num[i + 1]) {
                min = num[ i + 1];
            }
        }
        System.out.println("\n一维数组的最小值是："+min);  // 输出数组最小值
    }
}
