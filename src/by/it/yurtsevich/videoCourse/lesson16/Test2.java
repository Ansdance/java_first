package by.it.yurtsevich.videoCourse.lesson16;

public class Test2 {
    public static void main(String[] args) {
        String s1 = "asdafsd777fsdsdsdf";
        // Стринг с2 начинается с третьего симвоала стринга с1
        String s2 = s1.substring(3);
        System.out.println(s2);
        // Стринг с5 начинается с 3 по 7 символ
        String s5 = s1.substring(1, 11);
        System.out.println(s5);
        // Трим убирает пробелы до и после, но не в середине
        System.out.println(s2.trim());
        // Метод реплейс меняет элементы(символы) СТРИНГ ЗАМЕНА
        System.out.println(s2.replace("a", "A"));
        // Метод реплейс меняет элементы(символы) ЧАР ЗАМЕНА
        System.out.println(s2.replace('7', '8'));
        // Замена символов возможно не по одному и не обязательно на количество заменяемых линий
        System.out.println(s5.replace("asdaf", "Ad77s"));
    }
}
