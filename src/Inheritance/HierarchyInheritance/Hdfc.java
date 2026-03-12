package Inheritance.Hierarchy;

public class Hdfc extends Bank {

    int balance;

    public void deposite(int money) {

        this.balance = this.balance + money;
        super.totalBalance = this.balance;

        System.out.println("Successfully deposited");
    }

    public int withdraw(int money) {

        if (this.balance > money) {

            this.balance = this.balance - money;
            super.totalBalance = this.balance;

            System.out.println("Successfully withdrawn");
            return money;

        } else {

            System.out.println("Not sufficient bank balance");
            return 0;
        }
    }

    public static void main(String[] args) {

        Hdfc h = new Hdfc();

        h.deposite(1000);
        System.out.println(h.checkBalance());

        h.withdraw(500);
        System.out.println(h.checkBalance());

    }
}