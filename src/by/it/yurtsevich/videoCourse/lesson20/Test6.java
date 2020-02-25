package by.it.yurtsevich.videoCourse.lesson20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Test6 {
    public static void main(String[] args) {
        String s1 = "A";
        String s2 = "B";
        String s3 = "C";
        String s4 = "D";
        ArrayList<String> list = new ArrayList<>();
        list.add(s4);
        list.add(s3);
        list.add(s1);
        list.add(s2);
        System.out.println(list);
        // Сортируем лист
       // Collections.sort(list);
        System.out.println(list);
        ArrayList<String> list2 = list;
        System.out.println(list.equals(list2));
        // Метод иквелс в листе, как и в стринге перезаписан, то есть если кол-во елементов и сами элементы одинаковые
        // то метод вернет тру
        ArrayList<String> list3 = new ArrayList<>();
        list3.add(s4);
        list3.add(s3);
        list3.add(s1);
        list3.add(s2);
        System.out.println(list3.equals(list));

        // Iterator - повторитель
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
