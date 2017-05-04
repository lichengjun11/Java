package java1702.javase.reflect;

import org.omg.Dynamic.Parameter;

import java.lang.reflect.Constructor;

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
class HumanTest{


    public static void main(String[] args) throws NoSuchMethodException {
        Class clazz = Human.class;
        
        Constructor[] constructors = clazz.getConstructors();
        System.out.println("-- getConstructors() ---");
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName());
            for (java.lang.reflect.Parameter parameter : constructor.getParameters()) {
                System.out.println("\t" + parameter.getName());
            }
        }
        Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
        System.out.println("---getDeclaredConstructors---");
        for (Constructor declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor.getName());
            for (java.lang.reflect.Parameter parameter : declaredConstructor.getParameters()) {
                System.out.println("\t" + parameter.getName());
            }
        }

        Constructor constructor = clazz.getDeclaredConstructor(int.class,double.class,String.class,boolean.class);
        System.out.println(constructor.getName());

    }
}