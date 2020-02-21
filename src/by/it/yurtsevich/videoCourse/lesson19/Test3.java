package by.it.yurtsevich.videoCourse.lesson19;

public class Test3 {
    public static void main(String[] args) {
        String[] students = {"Petrov", "Ivanov", "Sidorov"};
        String[] exams = {"math", "economic", "history"};
        for (String s1 : students) {
            for (String s2 : exams) {
                System.out.println(s1 + " " + s2);
            }
        }
    }
}
