package java1702.javase.reflect;

import java.lang.reflect.Field;

/**
 * Created by Li chengjun
 * on 2017/5/4 9:03.
 */
public class AccessibleTest {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
        Person person = new Person(25);
        Class aClass = person.getClass();
       Field fields = aClass.getDeclaredField("age");
       fields.setAccessible(true);
        fields.set(person,30);
        System.out.println(fields.get(person));


    }
}
class Person{


    private int age;

    public Person(int age) {
        this.age = age;
    }
}