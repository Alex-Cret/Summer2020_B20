package day40_CustomClassPractice;

public class BofA {

    public static void main(String[] args) {

        BankAccount Alex= new BankAccount();
        Alex.setAccountInfo("Saving","Alex Cretu","123445567");
        Alex.getAccountInfo();
        Alex.deposit(1000);
        Alex.checkBalance();
        Alex.withDraw(500);
        Alex.checkBalance();
        Alex.withDraw(100000);
        Alex.checkBalance();
    }
}
