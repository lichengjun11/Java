package java1702.javase.reflect.demo.c;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * Created by Li chengjun
 * on 2017/5/5 11:35.
 */
public class Service {
    public void write(){
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("src/main/java/java1702/javase/reflect/demo/c/config.properties"));
            String className = properties.getProperty("className");
            String methodName = properties.getProperty("methodName");

            Class aClass = Class.forName(className);
            Method method = aClass.getDeclaredMethod("methodName");
            Constructor constructor = aClass.getDeclaredConstructor();
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
