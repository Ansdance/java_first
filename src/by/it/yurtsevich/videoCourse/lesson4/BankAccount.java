package by.it.yurtsevich.videoCourse.lesson4;

public class BankAccount {
    int id;
    String name;
    double balance;

    public static void main(String[] args) {
        BankAccount MyAccount = new BankAccount();
        MyAccount.id=1;
        MyAccount.name="Kostya";
        MyAccount.balance=25.5;

        BankAccount HisAccount = new BankAccount();
        HisAccount.id=2;
        HisAccount.name="Liza";
        HisAccount.balance=150.5;

        BankAccount YourAccount = new BankAccount();
        YourAccount.id=3;
        YourAccount.name="Misha";
        MyAccount.balance=250.5;

    }
}
