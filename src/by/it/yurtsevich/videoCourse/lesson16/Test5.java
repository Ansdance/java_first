package by.it.yurtsevich.videoCourse.lesson16;

public class Test5 {
    public static void main(String[] args) {
        String s = null;
        s += "OK";
        System.out.println(s);
        String s1 = "PRIVET";
        // Делает все символы маленькими
        String s2 = s1.toLowerCase();
        System.out.println(s2);
        String s4 = "hello";
        // Делает все символы большими
        String s5 = s4.toUpperCase();
        System.out.println(s5);
        // Метод контейнс проверяет находится ли в стринге то, что мы пытаемся найти. !возвращает тру или фолс
        boolean b = s1.contains(":2");
        System.out.println(b);
        // Метод иквелсИгнорКейс
        String s10 = "Kak Dela?";
        String s11 = "kak dela?";
        System.out.println(s10.equals(s11)); // FALSE - разные величины букв
        System.out.println(s10.equalsIgnoreCase(s11)); // TRUE - игнорируем величины букв
    }
}
