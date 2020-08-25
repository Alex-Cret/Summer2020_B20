package day40_CustomClassPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitalOne {

    public static void main(String[] args) {
        BankAccount Beslan=new BankAccount();
        BankAccount Ahmet=new BankAccount();
        BankAccount Viorel= new BankAccount();
        BankAccount Nurmamer= new BankAccount();
        BankAccount Waqar=new BankAccount();

        Beslan.setAccountInfo("Checking","Beslan","132313113213");
        Ahmet.setAccountInfo("Checking","Ahmet","13151312132");
        Viorel.setAccountInfo("Checking","Viorel","132146541321");
        Nurmamer.setAccountInfo("Checking","Nurmamet","2314231321");
        Waqar.setAccountInfo("Checking","Waqar","12145656+5");

        ArrayList<BankAccount>accounts=new ArrayList<>();
        accounts.addAll(Arrays.asList(Beslan,Ahmet,Viorel,Nurmamer,Waqar));

        for(BankAccount each: accounts){
            each.getAccountInfo();
            each.deposit(500);
        }
        accounts.get(3).deposit(1000);
        accounts.get(3).checkBalance();

        accounts.get(4).deposit(600);
        accounts.get(4).checkBalance();

        System.out.println("======================================");

        accounts.removeIf(each->each.balance<1000 );

        for (BankAccount each: accounts){
            each.getAccountInfo();
        }

    }


}
