package java1702.javase.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

/**
 * Created by Li chengjun
 * on 2017/5/11 20:11.
 */
public class Data {
    private static final String[] fileNames={

    "dongcheng",
            "xicheng",
            "chaoyang",
        "haidian",
        "fengtai",
        "shijingshan",
        "tongzhou",
        " changping",
        " daxing",
        "yizhuangkaifaqu",
        "shunyi",
        "fangshan",
        "mentougou",
        "pinggu",
        "huairou",
        "miyun",
        "yanqing",
        "yanjiao"
    };
    private static int counter;
    private static final String PATH = "data/bj";
    public static void main(String[] args) {
        for (String fileName : fileNames) {
            try(BufferedReader reader = new BufferedReader(new FileReader(PATH.concat(fileName)))) {
            String line;
            while((line = reader.readLine())!= null){
                System.out.println(line);
                counter++;
            }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    }
