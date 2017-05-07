package test;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Li chengjun
 * on 2017/5/7 20:46.
 */
public class JianDan {
    private static final String JIANDAN_URL = "http://jandan.net/tag/%E4%BA%BA%E5%B7%A5%E6%99%BA%E8%83%BD";
    private static int counter;
    public static void main(String[] args) {
        try {
            URL url = new URL(JIANDAN_URL);
            try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()))) {
           String line;
           while((line = bufferedReader.readLine()) != null){
               if(line.contains("data-original")){
                   String imageURL = line.substring(line.indexOf("//tankr"),line.indexOf("jpg")+3);
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
    public static void download(String imageUrl){
        try{
            URL url1 = new URL(imageUrl);//  inputstream是url取得的

            try(BufferedInputStream in = new BufferedInputStream(url1.openStream());
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("images/" + (++counter)+"jpg")))
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
