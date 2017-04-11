package java1702.javase.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Li chengjun
 * on 2017/4/10 19:34.
 */
//编写一个学生类，将学生的姓名，年龄，性别分别保存到 HashSet ArrayList
  //  Hashtable 中，并利用迭代器 Iterator 将姓名，年龄，性别打印出来
public class StudentTest1 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("张三",17,'M'));
        students.add(new Student("李四",18,'F'));

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student next = iterator.next();
        System.out.println(next.getAge());
        System.out.println(next.getName());
        System.out.println(next.getGender());
        }
//        for (Student student : students) {
//            System.out.println(student.getAge());
//            System.out.println(student.getName());
//            System.out.println(student.getGender());
//        }

    }
}

class Student {
    private String name;
    private int age;
    private char gender;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public Student(String name, int age, char gender) {

        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}