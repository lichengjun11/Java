package java1702.javase.basic;

/**
 * Created by lichengjun on 2017/3/16.
 */
public class Father {
    int money;
  public String coding() {
       System.out.println("java1702.javase.basic.Father is coding...");
       return "你是你我是我";
   }
//代码重用
}

 class Son extends Father {
}
 class ExtendsTest {
    public static void main(String[] args) {
        Father father = new Father();
        System.out.println(father.money);

        father.coding();

        Son son = new Son();
        System.out.println(son.money);
        System.out.println( son.coding());
    }
}



