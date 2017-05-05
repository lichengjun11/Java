package java1702.javase.reflect.demo.a;

/**
 * Created by Li chengjun
 * on 2017/5/5 11:13.
 */
//   高层应用类
    // 强耦合   完全融合在一起
    //  service调用底层来做事情，service它不直接做事情
public class Service {
    //    private FloppyWriter floppyWriter = new FloppyWriter();

    private PortableHdWriter portableHdWriter;

    public Service(PortableHdWriter portableHdWriter) {
        this.portableHdWriter = portableHdWriter;
    }

    public void write(){
        portableHdWriter.writeToPortableHd();
    }
}
