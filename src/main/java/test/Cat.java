package test;

/**
 * Created by Li chengjun
 * on 2017/3/25 10:09.
 */
 class Cat {
     String name;
     char gender;


    public void walk() {
        System.out.println();
    }
    public void look() {
        System.out.println();
    }
}


class Cat1 extends Animal {
    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void run() {
        super.run();
    }
}

class Cat2 implements Flying, Swiming {

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }
}