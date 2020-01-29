package by.it.yurtsevich.videoCourse.homework.homework5;

public class BankAccount {
    double balance1;

    double popoplnenieScheta(double dengi) {
        balance1 += dengi;
        return balance;
    }

    double snyatieSoScheta(double dengi) {
        balance1 -= dengi;
        return balance;
    }

    void showinfo() {
        System.out.println(balance1);
    }

    int id;
    String name;
    double balance;

    public static void main(String[] args) {

        BankAccount MyAccount = new BankAccount();
        MyAccount.id = 1;
        MyAccount.name = "Kostya";
        MyAccount.balance = 25.5;
        MyAccount.snyatieSoScheta(10);


        BankAccount HisAccount = new BankAccount();
        HisAccount.id = 2;
        HisAccount.name = "Liza";
        HisAccount.balance = 150.5;

        BankAccount YourAccount = new BankAccount();
        YourAccount.id = 3;
        YourAccount.name = "Misha";
        MyAccount.balance = 250.5;

    }
}
