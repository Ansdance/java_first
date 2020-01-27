package by.it.yurtsevich.videoCourse.lesson2;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        byte b1 = 5;
        byte b2 = 10;
        byte b3 = 15;

        short s1 = 20;
        short s2 = 30;
        short s3 = -40;

        int i1 = 1231;
        int i2 = -1231;
        int i3 = -133231;

        long l1 = 10000L; // L в конце

        float f1 = 212424.2424F; // F в конце

        double d1 = 2424.2342; // или с D в конце
        double d2 = 24214.2133D;

        char c1 = 's';
        char c2 = 'S';
        char c3 = 499; // отражает 499ый символ в юникоде ǳ - ЗДЕСЬ 10 система счисления
        char c4 = '\u0499'; // ҙ - здесь 16 система счисления

        int bin = 0b1001101; // 2 ставится спереди 0b
        int oct = 0_115; // 8 ставить 0 спереди,можно помогать себе андерскором, но необязательно
        int dec = 77; // 10
        int hex = 0x4D; // 16 система счисления 0х

        int i5 = 1_000_000; // символ андерскор(нижнее подчеркивание) помогает разделять цифры для удобства

        // Андерскор !нельзя использовать в начале или в конце числа, что само по себе нелогично, до/после букв F D L


        System.out.println(c2);
        System.out.println(d1);
        System.out.println(c3);
        System.out.println(c4);

        System.out.println(bin);
        System.out.println(oct);
        System.out.println(dec);
        System.out.println(hex);

    }
}
