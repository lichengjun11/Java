package java1702.javase.reflect;

import java.lang.reflect.Field;

/**
 * Created by Li chengjun
 * on 2017/5/4 9:03.
 */
public class AccessibleTest {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Person person = new Person(15);
        Class clazz = person.getClass();
        Field field = clazz.getDeclaredField("age");
        field.setAccessible(true);
        System.out.println(field.get(person));
        field.set(person,30);
        System.out.println(field.get(person));
    }
}
class Person{
    private int age;

    public Person(int age) {
        this.age = age;
    }
}