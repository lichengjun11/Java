package java1702.javase.test;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Li chengjun
 * on 2017/5/10 9:35.
 */
public class GuZiWangTest {
    private static final String url = "https://www.guazi.com/bj/audi/";
    private static int counter;

    public static void main(String[] args) {


        for (int i = 0; i < 8; i++) {
//            System.out.println("page:" + (i + 1) );
            try {
                page(i + 1);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    private static void page(int page) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("data/guziwang",true))){

        Document document = Jsoup.connect(url).get();
        Elements elements = document.select("div[class=list-infoBox]");
        Elements elements1 = document.select("div[class=filterBox]");
            for (Element element : elements1) {
                String chexing = element.select("dl[class=fliter-bd clearfix]").text();
            }
        for (Element element : elements) {
            String s = element.select("p[class=infoBox]").first().text();
            String jiage = element.select("i[class=fc-org priType]").first().text();
            String tupian = element.select("img[src]").attr("src");
//            System.out.println("车型：   " + s + "   价格：    " + jiage);
//            System.out.println(tupian);
//            writer.write("车型：   " + s + "   价格：    " + jiage + "\n");
//            System.out.println("\t" + "counter:"+ ++counter);
        }
        }
    }
}
