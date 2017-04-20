package java1702.javase.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Created by Li chengjun
 * on 2017/4/18 23:30.
 */
public class ReaderTest {
    public static void main(String[] args) {
        try(
            Reader reader = new FileReader("test1");
                ) {
            int i;
            while ((i=reader.read())!= -1){
                System.out.println((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//        Reader reader = null;
//        try {
//            reader = new FileReader("test1");
//            int i;
//            while ((i = reader.read()) != -1) {
//                System.out.println((char) i);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            if(reader!= null){
//                try {
//                    reader.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
    }
}
