package java1702.javase.test;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by Li chengjun
 * on 2017/5/11 19:42.
 */
public class Test {
    public static void main(String[] args) throws IOException {
        Document document = Jsoup.connect("http://bj.lianjia.com/ershoufang/rs/").cookie("lianjia_uuid","a39e625b-29e0-4a4a-aeb3-1b02b1e58c51").get();
        System.out.print("[");
        for (Element element : document.select("div[data-role] a[href^=/ershoufang]")) {
            System.out.print("'" + element.text() + "',");
        }
        System.out.print("]");
        System.out.println("-------");
        for (Element element : document.select("div[data-role] a[href^=/ershoufang]")) {
            System.out.println(element.attr("href").replaceAll("(ershoufang|/)",""));
        }}

}
