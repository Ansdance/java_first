package by.it.yurtsevich.videoCourse.lesson22.lesson22_1;

import by.it.yurtsevich.videoCourse.lesson22.Chelovek;

// С паблик методами прайвет переменных можно работать даже из других пакетов
public class Test3 {
    public static void main(String[] args) {
        Chelovek ch = new Chelovek("male");
        ch.setName("Kostya");
        ch.setVozrast(25);
        ch.setVes(65);
        System.out.println(ch.getName());
        System.out.println(ch.getVozrast());
        System.out.println(ch.getVes());
    }
}
