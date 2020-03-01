package by.it.yurtsevich.videoCourse.lesson24;

public class Test4 {

}

interface I1 {
    void abc();

    // Мы не можем создать дефолтный метод без тела !!! default method не должен быть final,static,abstract
    default void def() {
        System.out.println("Eto metod def");
    }
   default void ghi(){
       System.out.println("Eto metod ghi");
   }
}

// Можно не оверрайдить дефолтный метод из интерфейса
class Z2 implements I1 {
    @Override
    public void abc() {
        System.out.println("Eto metod abc");
    }

    public static void main(String[] args) {
        Z2 z = new Z2();
        z.abc();
        z.ghi();
        z.def();
    }
}