package day23_Arrays;
/*
write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$
            the program asks the user which bedroom does he/she wants to reserve and calculats the total price
            and then the program will ask:
                do you want to reserve another room:
                            if yes ==> repeat the previous steps
                            if no ==> your total price is: $$$
                            while answer is neither yes or no ==> please re-enter
            HINT: nested loop task, outter loop need to be an infinite loop
 */

import java.util.Scanner;

public class CybertekInn {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
int total=0;
        System.out.println("Welcome to Cybertek Inn!");

        System.out.println("please choose from the following:");
        System.out.println("1. King Bed: $120");
        System.out.println("2. Queen Bed: $100");
        System.out.println("3. Single Bed: $80");

        int option=input.nextInt();
        while (true) {
            switch (option) {
                case 1:
                    total += 120;
                    break;
                case 2:
                    total += 100;
                    break;
                case 3:
                    total += 80;
                    break;
                default:
                System.out.println("No more rooms option.");
            }
            System.out.println("do you want to reserve another room?");
            String a = input.next().toLowerCase();

            if(!(a.equals("Yes") || a.equals("no"))){
                System.out.println("Please re-enter:");
            }

            if (a.equals("no")) {
                break;
            }
        }

        System.out.println("Your total is: $"+total);

    }
}
