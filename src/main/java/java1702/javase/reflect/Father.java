package java1702.javase.reflect;

import java1702.javase.oop.InterfaceTest;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Created by Li chengjun
 * on 2017/5/5 15:21.
 */
public class Father<C> {  //  C - Career

    public Father() {
        System.out.println(((Class)(((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0])).getSimpleName());
    }
}

 class Doctor{}  // 医生
 class lawyer{}    // 律师
 class Programmer{}  // 程序员

  class SonA extends Father<Doctor>{}   // sonA继承父类的医生职业
  class SonB extends Father<lawyer>{}   // sonB继承父类的律师职业
  class SonC extends Father<Programmer>{}   // sonC继承父类的程序员职业
class SonD extends Father<Programmer>{} // sonD继承父类的程序员职业

class SonTest{
    public static void main(String[] args) {
        SonA sonA = new SonA();
        SonB sonB = new SonB();
        SonC sonC = new SonC();
        SonD sonD = new SonD();

        Class clazz = SonA.class;
        Type type = clazz.getGenericSuperclass();
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type[] types = parameterizedType.getActualTypeArguments();
        Type t = types[0];
        System.out.println(t.getTypeName().substring(t.getTypeName().lastIndexOf('.')+1)); // 用字符串截取出doctor

        Class aClass = (Class) t;
        System.out.println(aClass.getSimpleName());



    }
}


//class Son extends Father implements InterfaceTestt{
//    public static void main(String[] args) {
//        Class clazz = Son.class;
//        System.out.println(clazz.getSuperclass());
//        System.out.println(clazz.getInterfaces());
//
//    }

