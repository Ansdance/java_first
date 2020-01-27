package by.it.yurtsevich.videoCourse.lesson3;

public class Test7 {
    public static void main(String[] args) {

        // Логические операнды и (&&) и (||) или
        boolean x = true;
        boolean y = true;
        boolean z = false;
        boolean result = x && y && z;
        boolean result1 = x || y || z;
        System.out.println(result); // false, так как даже если одно выражение фолс(нам не подходит) результат фолс
        System.out.println(result1); // true, так как хоть одно выражение тру(нам подходит)

        // SHORT CIRCUIT - в выражении boolean res = first&&second; джава видит сразу первое значение фолс и
        // и остальное уже не проверяет, так как && уже будет фолс и в проверке смысла нет(в остальных значениях), тоже
        // и с ||, если в начале сразу указывается тру,то и все выражение будет тру,дальше проверяться ничего не будет

        boolean first = false;
        boolean second = true;
        boolean res = first && second;
        System.out.println(res);

        //!- оператор не !true=false !false=true
        boolean a = true;
        boolean b = false;
        System.out.println(!a); //не правда - выведет ложь
        System.out.println(!b); // не ложь - выведет правда

        int q = 10;
        int w = 5;
        int e = 15;
        boolean c = !(q > w); // false, так как 10 больше 5
        boolean c1 = !(q > e); // true, так как 15 больше 10
        System.out.println(c);
        System.out.println(c1);

        // betwice or (|) and (&) работа с числами, прсиходит переход в двоичную систему счисления и сравнения 1(тру
        // и 0 (фолс) 1111-это 15 в десятичной системе. 0 - это фолс

        int s = 10;
        int f = 5;
        System.out.println(s | f);
        System.out.println(s & f);

        // ^ betwice exclusive OR - возвращает тру, тогда и только когда только ОДНА операнда тру!

        boolean b5 = true;
        boolean b6 = true;
        boolean b7 = true;
        boolean b8 = true;
        System.out.println(b5^b6^b7^b8);


    }
}
