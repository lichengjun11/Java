package java1702.javase.reflect;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Li chengjun
 * on 2017/5/3 17:31.
 */
public class Chinese {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(1);
        }
        list.add(0);
        System.out.println(list.size());

        Field array = list.getClass().getDeclaredField("elementData");
        array.setAccessible(true);
        System.out.println(((Object[])array.get(list)).length);
    }
}
