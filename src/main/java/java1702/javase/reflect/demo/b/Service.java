package java1702.javase.reflect.demo.b;

/**
 * Created by Li chengjun
 * on 2017/5/5 11:24.
 */
//  强耦合 --》 松散耦合的过程叫 ：解耦合
public class Service {
    private DeviceWriter deviceWriter;

    public void setDeviceWriter(DeviceWriter deviceWriter) {
        this.deviceWriter = deviceWriter;   // set方法
    }
//    public Service(DeviceWriter deviceWriter) {
//        this.deviceWriter = deviceWriter;  // 构造方法
//    }

    public void write(){
        deviceWriter.writeToDevice();
    }
}
