package java1702.javase.reflect.demo.c;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * Created by Li chengjun
 * on 2017/5/5 11:35.
 */
//  第一步，读配置文件

public class Service {
    public void write()  {
     Properties properties = new Properties();// 创建Properties的实例
        try {
         // inputstream 是一个抽象类，所以new的是它的子类fileinputstream
            properties.load(new FileInputStream("src/main/java/java1702/javase/reflect/demo/c/cofig.properties")); // 用实例对象来加载配置文件
            String className = properties.getProperty("className");
            String methodName = properties.getProperty("methodName");
            Class clazz = Class.forName(className); // ?
            Method method = clazz.getDeclaredMethod(methodName);
            Constructor constructor = clazz.getDeclaredConstructor();
            method.invoke(constructor.newInstance());

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}