package java1702.javase.oop;

/**
 * Created by Li chengjun
 * on 2017/4/5 20:06.
 */
public class Animal {
    private String name;
    private int id;

    public Animal(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public void eat() {
        System.out.println(name+"正在吃");
    }
    public void sleep() {
        System.out.println(name+"正在睡");
    }
}

class Penguin extends Animal {

    public Penguin(String name, int id) {
        super(name, id);
    }
}

class Mouse extends Animal {

    public Mouse(String name, int id) {
        super(name, id);
    }
}
