package java1702.javase.oop;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/**
 * Created by lichengjun on 2017/3/17.
 */
public class Oop2 {

}

 class Cube {
    int length;
    int width;
    int height;

    public Cube(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public int tiJi() {
        return width* height* length;
    }

    public static void main(String[] args) {
        Cube cube = new Cube(44,23,55);
        System.out.println(cube.tiJi());
    }
}
