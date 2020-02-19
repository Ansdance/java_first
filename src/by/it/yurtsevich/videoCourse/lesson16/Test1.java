package by.it.yurtsevich.videoCourse.lesson16;

public class Test1 {
    public static void main(String[] args) {
        String s1 = "Privet";
        // показывает длинну стринга (ЛЕНС)
        System.out.println(s1.length());
        // показывает индекс символа (ЧарЭТ) !!считается с 0
        System.out.println(s1.charAt(3));
        //показывает индекс символа т
        System.out.println(s1.indexOf('t'));
        //показывает индекс символа т
        System.out.println(s1.indexOf("t"));
        // показывает с какого символа начинается вет, порядковый номер -3
        System.out.println(s1.indexOf("vet"));
        String s2 = "sadasdadwacf";
        // Ищет символ а с 5го символа
        System.out.println(s2.indexOf("a", 5));
        // Возвращает булианское значение (тру  ли фолс) в зависимости с чего начинется
        System.out.println(s2.startsWith("sa"));
        // Возвращает булианское значение (тру  ли фолс) в зависимости на что заканчивается
        System.out.println(s2.endsWith("sa"));


    }
}
