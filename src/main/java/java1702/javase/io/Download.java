package java1702.javase.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Li chengjun
 * on 2017/4/20 20:05.
 */
// 读取输入流再写入本地文件
public class Download {
    private static final String IMAGE_URL = "http://s.cn.bing.net/th?id=OJ.58V1JdyCq3tEwg&pid=MSNJVFeeds/1.2.tif";

    public static void main(String[] args) {
        try {
            URL url = new URL(IMAGE_URL);
            try (
                    InputStream inputStream = url.openStream();
                    OutputStream outputStream = new FileOutputStream("test.png")
            ) {
                System.out.println(inputStream.available());
                int i;
                while ((i = inputStream.read()) != -1) {
                    outputStream.write(i);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}