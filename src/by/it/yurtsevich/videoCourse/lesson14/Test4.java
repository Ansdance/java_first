package by.it.yurtsevich.videoCourse.lesson14;

public class Test4 {
    public static void time() {
        int chas = 0;
        int minuta = 0;
        OUTER:
        for (chas = 0; chas <= 23; chas++) {
            INNER:
            for (minuta = 0; minuta <= 59; minuta++) {
                System.out.println(chas + ":" + minuta);
                if (minuta == 30) {
                    break INNER;
                }
            }
        }
    }

    public static void main(String[] args) {
        Test4 t4 = new Test4();
        t4.time();
    }
}
