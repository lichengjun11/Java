package java1702.javase.test;

import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.SocketTimeoutException;

/**
 * Created by Li chengjun
 * on 2017/5/14 19:45.
 */
public class GuaZiZhuaQu implements Runnable{
    private static final String URL = "https://www.guazi.com/bj/";

    public GuaZiZhuaQu(String car) {
        this.car = car;
    }

    private String car;

    public static void main(String[] args) throws IOException {
        Document document = Jsoup.connect(URL).get();
        Elements elements = document.select("div[class=dd]").first().select("a");
        for (Element element : elements) {
            System.out.println(element);
        }
//        for (Element element : elements) {
//            String car = element.attr("href").replaceAll("bj|/","");
//            System.out.println(car);
//            Thread thread = new Thread(new GuaZiZhuaQu(car));
//            thread.start();
//        }
    }
    @Override
    public void run() {
//        try {
//            Document cardocument = Jsoup.connect(URL.concat(car)).timeout(0).get();
//            int page = 22;
//            for (int i = 0; i < 22; i++) {
//                page(car,i+1);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }}
//
//    private static void page(String car, int page) {
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter("data/qiche/+car", true))) {
//                Document document2 = Jsoup.connect(URL.concat(car) + "o" + page).get();
//                Elements elements2 = document2.select("div[class=list-infoBox]");
//            for (Element element : elements2) {
//                String s = element.select("a[class=info-title]").first().text();
//                String jiage =element.select("i[class=fc-org priType]").first().text();
//                String a = element.select("p[class=fc-gray]").first().text();
//                writer.write("车型：  " + s + "     价格：   " + jiage  +  "   上牌时间：   " + a);
//            }
//
//        }
//        catch(SocketTimeoutException e){
//            System.out.println("-----socket time out : " + car + ",page: " + page);
//            page(car,page);
//        }catch(HttpStatusException e){
//            System.out.println("----http status code:" + car + ",page:" + page);
//            page(car,page);
//        }catch (IOException e) {
//            page(car,page);
//        }
//
//    }
//}