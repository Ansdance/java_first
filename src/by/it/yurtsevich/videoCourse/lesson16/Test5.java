package by.it.yurtsevich.videoCourse.lesson16;

public class Test5 {
    public static void main(String[] args) {
        String s = null;
        s += "OK";
        System.out.println(s);
        String s1 = "PRIVET";
        String s2 = s1.toLowerCase();
        System.out.println(s2);
        // Метод контейнс проверяет находится ли в стринге то, что мы пытаемся найти. !возвращает тру или фолс
        boolean b = s1.contains(":2");
        System.out.println(b);

    }
}
