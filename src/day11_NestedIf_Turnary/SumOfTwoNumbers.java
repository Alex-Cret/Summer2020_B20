package day11_NestedIf_Turnary;

import java.util.Scanner;

public class SumOfTwoNumbers {
    /*
    write a program that can ask youser to enter two number, and the prints the sum of those two number
            Enter your first number
            10
            Enter your second number
            20
     */

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter your first number:");

        int num1 = input.nextInt();

        System.out.println("Enter your second number:");
        int num2 =input.nextInt();

        System.out.println("Sum of your numbers is: "+(num1+num2));

    }


}


