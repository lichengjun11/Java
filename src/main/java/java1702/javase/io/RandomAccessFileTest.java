package java1702.javase.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by Li chengjun
 * on 2017/4/21 19:31.
 */
//RandomAccessFile这个类实现了Closeable接口和DateInput接口。DateOutput接口
public class RandomAccessFileTest {
    public static void main(String[] args) {
        try ( RandomAccessFile randomAccessFile = new RandomAccessFile("raf","rw")){

            for(int i =0;i<10;i++){
                randomAccessFile.writeDouble(i*0.5);
            }
            //  如果我想获得2这个数，我就要写32L，因为从0.5开始要循环四次才能到2.一个double值占8个字节
            // 整形占4个字节
            randomAccessFile.seek(32);
            System.out.println(randomAccessFile.readDouble());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
