package java1702.javase.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by Li chengjun
 * on 2017/4/20 8:23.
 */
public class WriterTest {
    public static void main(String[] args) {
        try {
            Writer writer = new FileWriter("new");
            writer.write("你好你叫什么名字");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
