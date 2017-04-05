package java1702.javase.oop;

/**
 * Created by Li chengjun
 * on 2017/4/5 20:53.
 */
public class Person2 {
    public String name = "xiaomiao";

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int age = 18;
}

class Student2 extends Person2 {
    public Student2(String name, int age) {
        super(name, age);
    }

    void study() {
        System.out.println("I can study!");
    }
}

class JiCheng {
    public static void main(String[] args) {
        Student2 student2 = new Student2("王飞",30);
        Person2 person2 = new Person2("李非",33);
        System.out.println("name="+student2.name+"..."+"age="+student2.age);
        System.out.println("name="+person2.name+"..."+"age="+person2.age);
    }
}
