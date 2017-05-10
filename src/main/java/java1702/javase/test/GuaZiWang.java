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
public class GuaZiWang {
        private static final String url = "https://www.guazi.com/bj/benz/o";
    private static int counter;

    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            System.out.println("page:" + (i + 1));
    page(i + 1);
        }
    }
    public static void page(int page)  {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("data/test"))){
        Document document = Jsoup.connect(url).get();
        Elements elements = document.select("div[class=list-infoBox");
//        System.out.println(elements.size());
        for (Element element : elements) {
            String s = element.select("p[class=infoBox]").first().text();
            String jiage = element.select("i[class=fc-org priType").first().text();
//        System.out.println("车型:   "+ s + "     价格：" + jiage);
        writer.write("车型：  "+ s + "   价格：  "  + jiage + "\n");
            System.out.println("\t"+"counter:"+ ++counter);
//        writer.write(s+jiage);
        }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
