package java1702.javase.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Li chengjun
 * on 2017/4/27 10:19.
 */
public class E4 {
    public static void main(String[] args) {
    int sum = 0;
    int min = 9998;
    int max = 2;
        List<Integer> list = new ArrayList<>();
        try(RandomAccessFile raf = new RandomAccessFile("a.txt","rw");){
            for(int i=0;i<5000;i++){
                int r = (int)(Math.random()*9997+2);
                raf.writeInt(r);
            }
            raf.seek(0);  //  将指针指向0
            for (int i = 0; i < 5000; i++) {
//               sum += raf.readInt();
                int r = raf.readInt();
                if(r<min){
                    min = r;
                }
                if(r>max){
                    max = r;
                }
                list.add(r);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(min+":"+max);
        Collections.sort(list);
        System.out.println(list.get(0)+":"+list.get((list.size()-1)));
        System.out.println(sum/5000);
    }
}
