package by.it.yurtsevich.videoCourse.homework.homework15;

public class Time {
    public static void vremya() {
        int chas = 0;

        OUTER:
        while (chas < 6) {
            int minuta = -1;
            MIDDLE:
            do {
                minuta++;
                if (chas > 1 && minuta % 10 == 0)
                {
                    break;
                }
                int sekunda = 0;
                INNER:
                while (sekunda < 60) {
                    if (sekunda * chas > minuta) {
                        continue MIDDLE;
                    }
                    System.out.println(chas + ":" + minuta + ":" + sekunda);
                    sekunda++;
                }
            }
            while (minuta < 59);
            chas++;
        }
    }

    public static void main(String[] args) {
        vremya();
    }
}

