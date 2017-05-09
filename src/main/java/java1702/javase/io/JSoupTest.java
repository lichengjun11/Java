package java1702.javase.io;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

/**
 * Created by Li chengjun
 * on 2017/5/9 11:10.
 */
public class JSoupTest {
    public static void main(String[] args) throws IOException {
        Document document = Jsoup.connect("http://jandan.net/tag/%E8%AE%BE%E8%AE%A1").get();
        System.out.println(document);

    }
}
