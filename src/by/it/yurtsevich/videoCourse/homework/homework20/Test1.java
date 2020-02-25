package by.it.yurtsevich.videoCourse.homework.homework20;

import java.util.ArrayList;
import java.util.Collections;

public class Test1 {
    public static ArrayList<String> abc(String... string) {
        ArrayList<String> aL = new ArrayList<>();
        for (String s : string) {
            if (!aL.contains(s)) {
                aL.add(s);
            }
            Collections.sort(aL);
            System.out.println(aL);
        }
        return aL;
    }

    public static void main(String[] args) {
        Test1 t1 = new Test1();
        t1.abc("h", "sd", "s", "h", "a");
    }
}