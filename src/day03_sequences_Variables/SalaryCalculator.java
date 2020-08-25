package day03_sequences_Variables;

public class SalaryCalculator {

    public static void main(String[] args) {

                int salary=100000;
                double Tax=0.28;
                double salaryTax= salary*Tax;   //28000
                double salaryAfterTax= salary-salaryTax;  //72000

        System.out.print("Total tax:        ");
        System.out.println(salaryTax);
        System.out.print("Salary After Tax: ");
        System.out.println(salaryAfterTax);
    }
}
