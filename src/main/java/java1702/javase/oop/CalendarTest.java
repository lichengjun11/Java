package java1702.javase.oop;

import java.util.Calendar;

/**             二元运算符
 * Created by Li chengjun
 * on 2017/3/23 15:06.
 */
public class CalendarTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2017,3,23);
        System.out.println(calendar.getActualMaximum(calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(calendar.DAY_OF_WEEK));
    }

}
