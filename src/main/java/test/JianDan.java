package test;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Li chengjun
 * on 2017/5/7 20:46.
 */
public class JianDan implements Runnable{
    private static int counter;
    private static final String PAGE_URL = "http://jandan.net/tag/%E6%95%B0%E7%A0%81%E4%BA%A7%E5%93%81/page/";

    public JianDan(int page) {
        this.page = page;
    }

    private int page;
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            Thread thread = new Thread(new JianDan(i+1));
            thread.start();
            System.out.println("page:"+(i+1));
        }
    }

    public void run() {
        try {
            URL url = new URL(PAGE_URL + page);
            try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()))) {
           String line;
           while((line = bufferedReader.readLine()) != null){
               if(line.contains("data-original")){
                   String imageURL = line.substring(line.indexOf("//tankr"),line.indexOf("jpg")+3);
                   if (!imageURL.startsWith("http")) {
                       imageURL = "http:" + imageURL;
                   }
                   download(imageURL);
//                   System.out.println(imageURL);
               }
           }

            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
    static void download(String imageUrl){
        try{
            URL url = new URL(imageUrl);//  inputstream是url取得的

            try(
                    BufferedInputStream in = new BufferedInputStream(url.openStream());
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("images/" +(++counter)+ "."+"jpg")))
            {
                int i;
                while((i = in.read())!= -1){
                    out.write(i);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
