package by.it.yurtsevich.videoCourse.lesson8;

public class Test1 {
    // создаю паблик аксес модефаер и файнел аксес модефаер в итоге значение типа данной инт нельзя изменить
    // благодаря файнел и всегда будет 10. !!!файнел переменные не могут иметь деф. значения
    public final int a = 10;

    public static void main(String[] args) {
        Test1 t = new Test1();
        System.out.println(t.a);
    }
}
