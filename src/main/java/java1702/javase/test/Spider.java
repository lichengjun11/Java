package java1702.javase.test;

import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;

/**
 * Created by Li chengjun
 * on 2017/5/11 17:01.
 */

public class Spider implements Runnable {
    private static final String URL = "http://bj.lianjia.com/ershoufang/";
    private static final String UUID_KEY = "lianjia_uuid";// cookie 的键
    private static final String UUID_VALUE = "5a83ce81-c81e-47ec-b412-e4b6ffba4151";
    private String areaName;  //  地区的名字，拼音全拼
    public Spider(String areaName) {
        this.areaName = areaName;
    }
    public static void main(String[] args) throws IOException {
        Document document = Jsoup.connect(URL).cookie(UUID_KEY,UUID_VALUE).get();
        Elements elements = document.select("div[data-role=ershoufang]").first().select("a");
        for (Element element : elements) {
            String areaName = element.attr("href").replaceAll("(ershoufang|/)","");
           Thread thread = new Thread(new Spider(areaName));// 每个地区开一个线程
           thread.start();
        }
    }
    @Override
    public void run() {
    try {
        Document areaDocument = Jsoup.connect(URL.concat(areaName)).timeout(0).cookie("lianjia_uuid", "5a83ce81-c81e-47ec-b412-e4b6ffba4151").get();
        int totalHouses = Integer.parseInt(areaDocument.select("h2[class*=total]").first().child(0).text());
        int pages = (int)Math.ceil(totalHouses/30d);
        for(int i = 0; i < pages;i++){
            page(areaName,i+1);
            System.out.println(areaName+"\t\tpage:"+(i+1));
        }

    } catch (IOException e) {
        e.printStackTrace();
    }
    }
    private static void page(String areaName,int page){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("data/bj/"+areaName,true))){
            Document document = Jsoup.connect(URL.concat(areaName)+"/pg"+page).cookie("lianjia_uuid", "5a83ce81-c81e-47ec-b412-e4b6ffba4151").get();
            Elements elements = document.select("li[class=clear]");
            for (Element element : elements) {
                String imageUrl = element.childNode(0).attr("href");
                String id = imageUrl.substring(imageUrl.lastIndexOf("/")+1,imageUrl.lastIndexOf("."));
                String region = element.select("a[data-el=region]").first().text();
                String totalPrice = element.select("div[class=totalPrice]").first().child(0).text();
                Element houseInfoElement = element.select("div[class=houseInfo]").first();
                String houseInfo = houseInfoElement.childNode(2).toString();
                String unitPrice = element.select("div[class=unitPrice]").first().attr("data-price");
                writer.write(id + "@" + region + "@" + houseInfo + "@" + totalPrice + "@" + unitPrice + "\n");
            }

        } catch(SocketTimeoutException e){
            System.out.println("-----socket time out : " + areaName + ",page: " + page);
            page(areaName,page);
        }catch(HttpStatusException e){
            System.out.println("----http status code:" + areaName + ",page:" + page);
            page(areaName,page);
        }

        catch (IOException e) {
            System.out.println("----io exception : " + areaName + "page:" + page);
            page(areaName,page);
        }
 //异常处理：进行异常捕获时不仅应该把Exception 类对应的catch块放在最后，而且所有父类
 //异常的catch块都应该排在子类异常catch块的后面（先处理小异常，再处理大异常），否则会编译错误
    }
}







//public class Spider_MultiThreading implements Runnable {
//
////    private static final String[] CITIES = {"bj", "tj"};
//
//    private static final String URL = "http://bj.lianjia.com/ershoufang/";
//    private static final String UUID_KEY = "lianjia_uuid";
//    private static final String UUID_VALUE = "5a83ce81-c81e-47ec-b412-e4b6ffba4151";
//    private String areaName;
//
//
//    public Spider_MultiThreading(String areaName) {
//        this.areaName = areaName;
//    }
//
//    public static void main(String[] args) throws IOException {
//        //获得网址(URL)的文档对象
//        Document document = Jsoup.connect(URL).cookie(UUID_KEY, UUID_VALUE).get();
//        //查找一个css选择器:"div[data-role = ershoufang]".first()   select()返回是elements， 加first()返回element
//        Elements elements = document.select("div[data-role = ershoufang]").first().select("a");
//        for (Element element : elements) {
//            // element.attr():取得某一个属性对应的值即带有ershoufang的链接地址，采用替换(replaceAll方法去除ershoufang)
//            // 得到每个地区的名字areaName(名字的全拼写)
//            String areaName = element.attr("href").replaceAll("(ershoufang|/)", "");
//            Thread thread = new Thread(new Spider_MultiThreading(areaName));
//            thread.start();
//        }
//    }

//    @Override
//    public void run() {
//        try {
//            // timeout(0)：将超时时间设置为0就不会报超时     运行时有些超时错误(获取页面是时候反应时间太长了，超出了一个固定是时间报的异常)
//            Document areaDocument = Jsoup.connect(URL.concat(areaName)).timeout(0).cookie(UUID_KEY, UUID_VALUE).get();
//            // 获得某个地区房间的总数量                          [class*=total]：表示属性包含total   第一个子元素的文本
//            int totalHouses = Integer.parseInt(areaDocument.select("h2[class*=total]").first().child(0).text());
//            // 获得一个地区的总页数
//            int pages = (int) Math.ceil(totalHouses / 30d);
//            for (int i = 0; i < pages; i++) {//对页数进行循环
//                page(areaName, i + 1);//对每一页调用page()方法
//                System.out.println(areaName + "\t\tpage: " + (i + 1));
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }