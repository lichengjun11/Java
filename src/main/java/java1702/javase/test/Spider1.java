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
 * on 2017/5/9 20:23.
 */
  //  select   选择
public class Spider1 {
    public static void main(String[] args) throws IOException {
        String url = "https://www.guazi.com/bj/";
        Document document = Jsoup.connect(url).get();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("data/test"))){

        Elements elements = document.select("div[class=list-infoBox");
        System.out.println(elements.size());
        for (Element element : elements) {
            String s = element.select("p[class=infoBox]").first().text();
            String jiage = element.select("i[class=fc-org priType").first().text();
//        System.out.println("车型:   "+ s + "     价格：" + jiage);
        writer.write("车型：  "+ s + "   价格：  "  + jiage + "\n");
//        writer.write(s+jiage);
        }
        }
    }
}
