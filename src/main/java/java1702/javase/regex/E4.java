package java1702.javase.regex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * Created by Li chengjun
 * on 2017/5/6 14:28.
 */
//使用反射机制获取 java.lang.String 类的所有域、构造方法、成员方法
public class E4 {
    public static void main(String[] args) {

        Class clazz = String.class;
        Field[] field = clazz.getDeclaredFields();
        for (Field field1 : field) {
            System.out.println(field1.getName());
        }
        Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
        for (Constructor constructor : declaredConstructors) {
            System.out.println(constructor.getName());
            for (Parameter parameter : constructor.getParameters()) {
                System.out.println(parameter);
            }
        }
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }
}
