package by.it.yurtsevich.videoCourse.lesson20;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        list.add(new StringBuilder("hello"));
        list.add(new StringBuilder("bye"));
        list.add(new StringBuilder("ok"));
        list.add(1, new StringBuilder("Hi!"));
        for (StringBuilder s : list) {
            System.out.print(s + " ");
        }
        System.out.println();
        ArrayList<StringBuilder> list2 = new ArrayList<>();
        list.add(new StringBuilder("Petrov"));
        list.add(new StringBuilder("Sidorov"));

        list.addAll(list2);
        for (StringBuilder s : list) {
            System.out.print(s + " ");
        }
        list.clear();
        System.out.println();
        System.out.println();
        System.out.println();
        for (StringBuilder s : list) {
            System.out.println(s + " ");
        }
    }
}
