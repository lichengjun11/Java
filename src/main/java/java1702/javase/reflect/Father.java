package java1702.javase.reflect;

import java1702.javase.oop.InterfaceTest;

/**
 * Created by Li chengjun
 * on 2017/5/5 15:21.
 */
public class Father<C> {  //  C - Career
    public Father(){

    }
}
class SonA extends Father<Doctor>{

}
class SonB extends Father<Lawyer>{

}
class Doctor{

}
class Lawyer{

//interface InterfaceTestt{}
//
//class Son extends Father implements InterfaceTestt{
//    public static void main(String[] args) {
//        Class clazz = Son.class;
//        System.out.println(clazz.getSuperclass());
//        System.out.println(clazz.getInterfaces());
//
//    }
}

