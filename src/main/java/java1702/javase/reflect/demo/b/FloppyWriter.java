package java1702.javase.reflect.demo.b;

/**
 * Created by Li chengjun
 * on 2017/5/5 11:19.
 */
public class FloppyWriter implements DeviceWriter{
    @Override
    public void writeToDevice() {
        System.out.println("write to floppy...");
    }
}
