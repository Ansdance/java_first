package by.it.yurtsevich.videoCourse.lesson5;

public class Test10 {
    int summa(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }
}
class Test11{
    public static void main(String[] args) {
        Test10 t = new Test10();
        int summaTrexChisel = t.summa(1,3,5);
    }
}