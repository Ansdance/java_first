package by.it.yurtsevich.videoCourse.lesson22;

public class Chelovek {
    final String pol;

   public Chelovek(String pol) {
        this.pol = pol;
    }

    private String name;

    // Делаю инкапсуляцию имени
    public String getName() {
        return name;
    }

    public void setName(String s) {
        name = s;
    }

    private int vozrast;

    // Делаю инкапсуляцию возраста
    public int getVozrast() {
        return vozrast;
    }

    public void setVozrast(int i) {
        if (i > 0) {
            vozrast = i;
        }
    }

    private int ves;
    // Делаю инкапсуляцию веса
    public int getVes() {
        return ves;
    }

    public void setVes(int i) {
        if (i > 0) {
            ves = i;
        }
    }
}

class Test {
    public static void main(String[] args) {
        Chelovek ch = new Chelovek("male");
        ch.setName("Kostya");
        ch.setVozrast(25);
        ch.setVes(65);
        System.out.println(ch.getName());
        System.out.println(ch.getVozrast());
        System.out.println(ch.getVes());
    }
}