package by.it.yurtsevich.videoCourse.lesson17;

public class Test1 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(50);
        StringBuilder sb3 = new StringBuilder(sb2);
        StringBuilder sb4 = new StringBuilder("Good Day!!");

        // Показывает длинну стрингбилдира
        System.out.println(sb2.length());
        // Показывает символ, принимает инт(номер), возвращает символ
        System.out.println(sb4.charAt(5));
        // Показывает номер символа, возвращает инт, принимает стринг
        System.out.println(sb4.indexOf("d"));
        // показывает символ О со второго символа
        System.out.println(sb4.indexOf("0", 2));
        String s = sb4.substring(1);
        System.out.println(s);
        String s1 = sb4.substring(1, 6);
        System.out.println(s1);

        // Метод сиквенс работает также как и метод сабстринг
        System.out.println(sb4.subSequence(5, 8));
        // Метод апенд добавляет после нашего стрингбилдира DATA TYPE dt (ЛЮБОЙ возможный)
        System.out.println(sb4.append(sb4));
        System.out.println(sb4.append(498));
        System.out.println(sb3.append(143.4));
        System.out.println(sb4.append(true));

        // Метод инзерт вставляет на заданную нами позицию стрингбилдира DATA TYPE dt (ЛЮБОЙ возможный)
        System.out.println(sb4.insert(4, "hello good boy"));
        System.out.println(sb2.insert(sb2.length(), "Priveeeeet"));

        // Метод делит удаляет с заданного символа до заданного символа (принимает инт)
        StringBuilder sb10 = new StringBuilder("Hello World");
        sb10.delete(3, 6);
        System.out.println(sb10);

        // Метод делетЧарЭт удаляет заданный символ (принимает инт)
        sb10.deleteCharAt(6);
        System.out.println(sb10);

        // Метод реверс переворачивает стрингбилдер (выводит символы справа налево)
        sb10.reverse();
        System.out.println(sb10);

        // Метод реплейс заменяет с опред. символаа до опред. символа на заданный стринг параметр
        System.out.println(sb10.replace(2, 6, "Champion"));


    }
}
