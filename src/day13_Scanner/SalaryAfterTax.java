package day13_Scanner;
/*
write a program that can calculate the state tax, federal tax and salary after tax
                needed informations:
                                annual salaray
                                state tax rate
                                federal tax rate
                MUST use Scanner

 */


import java.util.Scanner;


public class SalaryAfterTax {
    public static void main(String[]args){

    Scanner input=new Scanner(System.in);
        System.out.println("Enter your annual salary: ");

        int salary=input.nextInt();

        System.out.println("Enter your state tax rate: ");
         double stateTaxRate=input.nextDouble();
         double stateTax=salary*stateTaxRate;

        System.out.println("Enter your fedral tax rate: ");

        double federalTaxRate=input.nextDouble();
        double federalTax=salary*federalTaxRate;

        double salaryAfterTax=salary-stateTax-federalTax;

        System.out.println("Your salary:$ "+salary);
        System.out.println("Your state tax:$"+stateTax);
        System.out.println("Federal tax:$"+federalTax);
        System.out.println("Your salary after tax:$"+salaryAfterTax);




}
}
