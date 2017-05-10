package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Li chengjun
 * on 2017/5/6 9:49.
 */
//  抓取网页源代码
public class LianJia {
    private static final String BAIDU_URL = "http://bj.lianjia.com/ershoufang/";

    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL(BAIDU_URL);
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()))) {
            String line;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
