package java1702.javase.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by Li chengjun
 * on 2017/4/20 8:19.
 */
public class OutputStreamTest {
    public static void main(String[] args) {
        try ( OutputStream outputStream = new FileOutputStream("new1")){
           outputStream.write(97);
           outputStream.write(98);
           outputStream.write(99);
           outputStream.write(100);
           outputStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        OutputStream outputStream= null;
//        try {
//            outputStream = new FileOutputStream("new");
//            outputStream.write(97);
//            outputStream.flush();
//        } catch (java.io.IOException e) {
//            e.printStackTrace();
//        }finally {
//            if(outputStream!= null){
//                try {
//                    outputStream.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
    }
}
