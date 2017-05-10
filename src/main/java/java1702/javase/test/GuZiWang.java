package java1702.javase.test;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by Li chengjun
 * on 2017/5/10 9:35.
 */
public class GuZiWang {
    public static void main(String[] args) throws IOException {
    String url = "https://www.guazi.com/bj/audi/";
        Document document = Jsoup.connect(url).get();
        Elements elements = document.select("p[class=infoBox]");
    }
}
