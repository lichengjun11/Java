package java1702.javase.reflect.demo.b;

/**
 * Created by Li chengjun
 * on 2017/5/5 11:24.
 */
public class Test {
    public static void main(String[] args) {
        Service service = new Service();
        service.setDeviceWriter(new FloppyWriter());
        service.write();
    }
}
