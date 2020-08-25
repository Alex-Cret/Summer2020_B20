package day15_String;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName=input.next();

        System.out.println("Enter your last name: ");
        String lastName= input.next();

        String fullName=firstName.concat(" ".concat(lastName));

        System.out.println("Your full name is: \n"+fullName);
    }
}
