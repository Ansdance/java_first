package by.it.yurtsevich.videoCourse.lesson25;

public class Test1 {
    public static void main(String[] args) {
        Employee emp1 = new Teacher();
        Employee emp2 = new Driver();
        Employee emp3 = new Doctor();
        emp1.work();
        emp2.work();
        emp3.work();
    }
}

abstract class Employee{
    void sleep(){
        System.out.println("Employee sleeps");
    }
    abstract void work();
}
class Teacher extends Employee implements HelpAble{
    @Override
    void work() {
        System.out.println("Teacher works");
    }

    @Override
    public void help() {
        
    }
}
class Driver extends Employee{
    @Override
    void work() {
        System.out.println("Driver works");
    }
}
class Doctor extends Employee{
    @Override
    void work() {
        System.out.println("Doctor works");
    }
}
interface HelpAble{
    void help();
    }
