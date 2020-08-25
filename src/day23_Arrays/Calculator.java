package day23_Arrays;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        while (true) {


            System.out.println("Enter two numbers:");

            int num1 = input.nextInt();
            int num2 = input.nextInt();

            System.out.println("Enter the math operator:");
            char o=input.next().charAt(0);

/*
            double result = (o=='+')? num1+num2 :(o=='-')? num1-num2 :(o=='*')?num1*num2:(o=='/')?
                    num1/num2 :(o=='%')?num1%num2:0;
            System.out.println(result);

 */
            switch (o){
                case '+':
                    System.out.println(num1+num2);
                    break;
                case '-':
                    System.out.println(num1-num2);
                    break;
                case '*':
                    System.out.println(num1*num2);
                    break;
                case '/':
                        System.out.println(num1/num2);
                        break;
                default:
                    System.out.println("Invalid opreator");
            }
            System.out.println("Do you want to continue?");

            System.out.println();
            String a = input.next().toLowerCase();

            while(!(a.equals("yes")||a.equals("no"))){
                System.out.println("Invali answer please enter yes or no");
                System.out.println("Do you want to continue?:");
            }

            if(a.equalsIgnoreCase(("no"))){
                break;
            }
        }

        System.out.println("Thanks for using Cybertek Calculator.");
        System.exit(0);
    }

}
