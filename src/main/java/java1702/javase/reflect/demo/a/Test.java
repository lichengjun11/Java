package java1702.javase.reflect.demo.a;

/**
 * Created by Li chengjun
 * on 2017/5/5 11:13.
 */
//  a包
    // 底层一旦切换,高层改动就会比较多
public class Test {
    public static void main(String[] args) {
        Service service = new Service(new PortableHdWriter());
        service.write();
    }
}
