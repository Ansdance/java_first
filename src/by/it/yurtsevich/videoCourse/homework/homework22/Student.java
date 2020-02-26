package by.it.yurtsevich.videoCourse.homework.homework22;

public class Student {
    private StringBuilder name = new StringBuilder();

    public StringBuilder getName() {
        StringBuilder name2 = new StringBuilder(name);
        return name2;
    }

    public void setName(StringBuilder s) {
        if (s.length() > 3) {
            name = s;
        }
    }

    private int course;

    public int getCourse() {
        return course;
    }

    public void setCourse(int c) {
        if (c > 1 && c <= 4) {
            course = c;
        }
    }

    public int grade;

    public int getGrade() {
        return grade;
    }

    public void setGrade(int g) {
        if (g > 1 && g <= 10) {
            grade = g;
        }
    }

    public void showInfo() {
        System.out.println("Имя студента: " + getName() + " Курс студента: " + getCourse()+ " Оценка студента: " + getGrade());
    }

}

class TestStudent extends Student {
    public static void main(String[] args) {
    Student s = new Student();
    s.setCourse(3);
    s.setGrade(9);
    StringBuilder sb1 = new StringBuilder("Misha");
    s.setName(sb1);
    s.showInfo();


    }
}
