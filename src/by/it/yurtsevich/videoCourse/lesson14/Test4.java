package by.it.yurtsevich.videoCourse.lesson14;

public class Test4 {
    public static void time() {
        int chas = 0;
        int minuta = 0;
        for (chas = 0; chas <= 23; chas++) {
            for (minuta = 0; minuta <= 59; minuta++) {
                System.out.println(chas + ":" + minuta);
            }
        }
    }

    public static void main(String[] args) {
        Test4 t4 = new Test4();
        t4.time();
    }
}
