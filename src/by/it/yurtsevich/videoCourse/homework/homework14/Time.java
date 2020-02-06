package by.it.yurtsevich.videoCourse.homework.homework14;

public class Time {
    public static void vremya() {
        int chas = 0;
        int minuta = 0;
        int sekunda = 0;
        for (chas = 0; chas <= 6; chas++) {
            if (chas > 1 && minuta % 10 == 0) {
                break;
            }
            for (minuta = 0; minuta <= 59; minuta++) {
                for (sekunda = 0; sekunda <= 59; sekunda++) {
                    if (sekunda * chas > minuta) {
                        continue;
                    }
                    System.out.println(chas + ":" + minuta + ":" + sekunda);
                }
            }
        }
    }

    public static void main(String[] args) {
        Time t = new Time();
        vremya();

    }
}
