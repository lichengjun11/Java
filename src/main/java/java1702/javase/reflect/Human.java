package java1702.javase.reflect;

import org.omg.Dynamic.Parameter;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Li chengjun
 * on 2017/5/3 17:32.
 */

class Animals {

    public int age;

    private double weight;

    public Animals() {
    }

    public Animals(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }

    public int sleep(int hours) {
        return hours;
    }

    public void eat(String food) {
        System.out.println("eating " + food);
    }

    private void killHuman() {
        System.out.println("killed a poor guy...");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

public class Human extends Animals {
    public String name;
    private boolean married;

    Human() {
    }

    public Human(int age, double weight, String name, boolean married) {
        super(age, weight);
        this.name = name;
        this.married = married;
    }

    @Override
    public void eat(String food) {
        System.out.println(name + " is now eating " + food);
    }

    public void study(String course) {
        System.out.println(name + " is now studying " + course);
    }

    private void killAnimals(String animal) {
        System.out.println(name + " is now killing " + animal);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }
}
class HumanTest {
//    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        Class clazz = Human.class;   // 先获取class
//        Constructor[] constructors = clazz.getConstructors(); //获取所有的公有构造方法
//        System.out.println("---getConstructors---");
//        for (Constructor constructor : constructors) {
//            System.out.println(constructor.getName());
//            for (java.lang.reflect.Parameter parameter : constructor.getParameters()) {
//                System.out.println("\t" + parameter.getName()); // 输出公有构造方法的元素名称
//            }
//        }
//        Constructor[] constructors1 = clazz.getDeclaredConstructors(); // 获取构造方法
//        System.out.println("---getDeclaredConstructors---");
//        for (Constructor constructor : constructors1) {
//            System.out.println(constructor.getName());
//            for (java.lang.reflect.Parameter parameter : constructor.getParameters()) {
//                System.out.println("\t" + parameter.getName()); // 输出所有构造方法的元素名称
//            }
//        }
//        Constructor constructor = clazz.getDeclaredConstructor(int.class,double.class,String.class,boolean.class);
//        System.out.println(constructor.getName());  // 获取一个构造方法
//        for (java.lang.reflect.Parameter parameter : constructor.getParameters()) {
//            System.out.println(parameter);  // 再获取这个构造方法的所有参数
//        }
//        // 通过构造器来创建这个类新的实例
//        Human human = (Human) constructor.newInstance(20,130,"jerry",false);
//        System.out.println(human.getName());
//    }
     public static void main(String[] args) { // 通过反射获取方法
    Class clazz = Human.class;
         Method[] methods = clazz.getMethods();
         for (Method method : methods) {
             System.out.println(method);
         }
         System.out.println("---------");
         Method[] methods1 = clazz.getDeclaredMethods();
         for (Method method : methods1) {
             System.out.println(method);
         }
}
}