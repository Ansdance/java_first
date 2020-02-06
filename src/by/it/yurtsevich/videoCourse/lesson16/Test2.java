package by.it.yurtsevich.videoCourse.lesson16;

public class Test2 {
    public static void main(String[] args) {
        String s1 = "asdafsdff";
        // стринг с2 начинается с третьего симвоала стринга с1
        String s2 = s1.substring(3);
        System.out.println(s2);
        // трим убирает пробелы до и после, но не в середине
        System.out.println(s2.trim());
        // Метод реплейс меняет элементы(символы)
        System.out.println(s2.replace("a", "A"));

    }
}
