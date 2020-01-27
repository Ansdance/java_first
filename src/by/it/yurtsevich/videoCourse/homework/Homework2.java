package by.it.yurtsevich.videoCourse.homework;

public class Homework2 {
    public static void main(String[] args) {
        byte bin = 0b1100;
        byte oct = 0_14;
        byte dec = 12;
        byte hex = 0xC;
        System.out.println(bin);
        System.out.println(oct);
        System.out.println(dec);
        System.out.println(hex);

        short bin1 = -1300;
        short oct1 = -0_2424;
        short dec1 = -1300;
        short hex1 = -0x514;
        System.out.println(bin1);
        System.out.println(oct1);
        System.out.println(dec1);
        System.out.println(hex1);

        int bin2 = 0b0;
        int oct2 = 0_0;
        int dec2 = 0;
        int hex2 = 0x0;
        System.out.println(bin2);
        System.out.println(oct2);
        System.out.println(dec2);
        System.out.println(hex2);

        long bin3 = 0b111010110111100110100010101L;
        long oct3 = 0_726746425L;
        long dec3 = 123456789L;
        long hex3 = 0x75BCD15L;
        System.out.println(bin3);
        System.out.println(oct3);
        System.out.println(dec3);
        System.out.println(hex3);

        float f1 = 212424.2424F; // F в конце
        System.out.println(f1);

        double d1 = 2424.2342; // или с D в конце
        double d2 = 24214.2133D;
        System.out.println(d1);
        System.out.println(d2);

        boolean bool1 = true;
        boolean bool2 = false;
        System.out.println(bool1);
        System.out.println(bool2);

        char c1 = 's';
        char c2 = 'S';
        char c3 = 499; // отражает 499ый символ в юникоде ǳ - ЗДЕСЬ 10 система счисления
        char c4 = '\u0499'; // ҙ - здесь 16 система счисления

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
    }
}
