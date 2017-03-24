package java1702.javase.oop;

import sun.text.resources.cldr.ia.FormatData_ia;

/**
 * Created by Li chengjun
 * on 2017/3/24 8:58.
 */
public class ScopeTest {   //变量产生作用的有效范围
    public void method() {
        int i = 5;
        int j = 1;
        System.out.println(i);

        for (int l = 0; l < 6; l++) {  // 块，block 作用域范围

            }
            for (int l = 0; l < 3; l++) {
        }
    }



    private int k;
    public void exceptionTest() {
        try {
            String s = "hello";
        } catch (Exception e) {
        } finally {

        }
    }
}
