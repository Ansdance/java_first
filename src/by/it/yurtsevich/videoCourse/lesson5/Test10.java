package by.it.yurtsevich.videoCourse.lesson5;

public class Test10 {
    //логика нашего метода
    int summa(int a, int b, int c) { // - это параметры
        int result = a + b + c;
        return result;
    }

    int sA(int a1, int b1, int c1) {
        int result2 = summa(a1, b1, c1) / 3;
        return result2;
    }
}

class Test11 {
    public static void main(String[] args) {
        Test10 t = new Test10();
        int summaTrexChisel = t.summa(1, 3, 5); //подставляем значения(аргументы)
        System.out.println(summaTrexChisel);
        System.out.println(t.sA(20, 40, 60));
    }
}