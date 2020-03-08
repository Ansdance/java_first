package by.it.yurtsevich.videoCourse.lesson26;

public class Test3 {
    void abc(int i) {
        System.out.println("int");
    }

    void abc(byte i) {
        System.out.println("byte");
    }

    void abc(long i) {
        System.out.println("long");
    }
    void def(Object o){
        System.out.println("Object");
    }
    void def (String o){
        System.out.println("String");
    }
    // В первую очередь будет вызываться стринг, так как это совпадение наиболее близкое
    // Будет вызываться инт, так как 5 - это дефолт инт, если закомментировать будет лонг
    public static void main(String[] args) {
        Test3 t3 = new Test3();
        t3.def("hello");
        t3.abc(5);
    }
}
