package java1702.javase.test;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by Li chengjun
 * on 2017/5/9 14:18.
 */
public class Spider1 {


    public static void main(String[] args) throws IOException {
        String url = "http://bj.lianjia.com/ershoufang/dongcheng/";
        Document document = Jsoup.connect(url).cookie("lianjia_uuid","a39e625b-29e0-4a4a-aeb3-1b02b1e58c51").get();
        Elements elements = document.select("li[class=clear");
        for (Element element : elements) {
            String region = element.select("a[data-el=region]").first().text();
//            System.out.println(region);
             String huxing = element.select("div[class=houseInfo]").first().text();
//            System.out.println(huxing);
            String zongjia = element.select("div[class=totalprice]").first().text();
            System.out.println("小区:"+region +"     户型:" + huxing + "      总价：" + zongjia);
            String img = element.select("a[class=img]").get(0).absUrl("href");
//            System.out.println(img);
        }
    }
}
