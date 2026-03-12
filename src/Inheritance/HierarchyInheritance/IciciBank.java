package Inheritance.Hierarchy;

public class IciciBank extends Bank {

    public boolean isEligible() {

        if (super.totalBalance > 500) {
            return true;
        } else {
            return false;
        }
    }

    public void deposite(int money) {
        super.totalBalance += money;
    }

    public void withdraw(int money) {
        super.totalBalance -= money;
    }

    public static void main(String[] args) {

        IciciBank i = new IciciBank();

        System.out.println(i.checkBalance());

        i.deposite(2000);
        i.withdraw(1000);

        System.out.println(i.checkBalance());
    }
}