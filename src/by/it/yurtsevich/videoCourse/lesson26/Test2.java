package by.it.yurtsevich.videoCourse.lesson26;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(5);
        int a = list.get(0);
        System.out.println(a);
        Integer b = new Integer(10);
        int c = b;
        //Работа метода парс
        String s1 ="50";
        String s3 ="50.33";
        String s2 = "true";
        int i1 = Integer.parseInt(s1);
        System.out.println(i1);
        boolean b1 =  Boolean.parseBoolean(s2);
        System.out.println(b1);
        double d = Double.parseDouble(s3);
        System.out.println(d);

        // Работа метода велуОф
        Integer i = Integer.valueOf(19);
        System.out.println(i);
        Double d2 = Double.valueOf(s3);
        System.out.println(d2);
    }
}
