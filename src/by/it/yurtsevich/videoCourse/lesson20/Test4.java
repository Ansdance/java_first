package by.it.yurtsevich.videoCourse.lesson20;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("bye");
        list.add("ok");
        list.add("Hi!");
        list.add("hello");
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();
        // Показыает индекс указанного обьекта
        System.out.println(list.indexOf("bye"));
        //Показывает последний индекс обьекта
        System.out.println(list.lastIndexOf("hello"));
        // Показывает размер листа
        System.out.println(list.size());
        // Показывает пуст лист или нет (ФОЛС - НЕ ПУСТ, ТРУ - ПУСТОЙ)
        System.out.println(list.isEmpty());
        // Данный метод показывает находится ли указанный элемент в листе (ТРУ - находится)
        System.out.println(list.contains("ok"));
        // Красиво выводит элементы листа без использования форич
        System.out.println(list.toString());
    }
}