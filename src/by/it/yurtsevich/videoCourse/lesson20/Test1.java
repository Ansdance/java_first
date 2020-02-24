package by.it.yurtsevich.videoCourse.lesson20;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        // Просто добавил
        list1.add("poka");
        list1.add("hello");
        list1.add("ok");
        // Добавил с первого индекса
        list1.add(1,"PRIVET");
        for (String s : list1) {
            System.out.print(s + " ");
        }
        System.out.println();
        // Гет метод возвращает элемент вызываемый по его индексу
        System.out.println(list1.get(3));
        // Сет заменяет на указанный иденкс указанное значение
        list1.set(2,"!!!");
        for (String s:list1){
            System.out.print(s+ " ");
        }
    }
}
