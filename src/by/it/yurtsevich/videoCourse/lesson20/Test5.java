package by.it.yurtsevich.videoCourse.lesson20;

import java.util.ArrayList;

public class Test5 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        ArrayList<StringBuilder> list = new ArrayList<>();
        list.add(sb1);
        list.add(sb2);
        list.add(sb3);
        ArrayList<StringBuilder> list2 = (ArrayList<StringBuilder>) list.clone();
        ArrayList<StringBuilder> list3 = list;
        System.out.println(list == list2);
        // True ссылаются на один обьект
        System.out.println(list == list3);

    }
}
