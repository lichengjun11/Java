package java1702.javase.exercise;

/**
 * Created by Li chengjun
 * on 2017/4/8 15:44.
 */
//按以下要求编写程序
//(1) 编写 Animal 接口，接口中声明 eat() 方法
//        (2) 定义Bird类和 Fish 类实现 Animal 接口,Bird 中还有 flying 方法，Fish 中还有 swimming 方法，分别实现这些方法
//        (3) 编写 Bird 类和 Fish 类的测试程序，并调用其中的各个方法
public interface A5 {
    void eat();
}

class Bird implements A5 {

    @Override
    public void eat() {

    }

    void fly() {

    }
}
