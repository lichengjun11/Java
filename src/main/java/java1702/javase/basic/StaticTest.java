package java1702.javase.basic;

/**
 * Created by Li chengjun
 * on 2017/3/22 8:47.
 */
public  class StaticTest {
    public static void main(String[] args) {
        Mankind tom = new Mankind();
        tom.name = "lichengjun";
        tom.age = 20;
        tom.married = true;
        System.out.println(tom.married);
        System.out.println(tom.age);
        System.out.println(tom.name);
        Mankind jerry = new Mankind();
        jerry.age = 25;
        jerry.name = "腾飞";
        System.out.println(jerry.age);
        System.out.println(jerry.name);
        System.out.println(jerry.married);
    }

    }


class Mankind {
    public String name;
    public int age;
    public static boolean married;


}