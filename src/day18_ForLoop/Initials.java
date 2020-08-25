package day18_ForLoop;
/*
write a program that asks user's first and last name, then prints out the initials of the user

                input:
                    cybertek
                    batch18
                output:
                    your initial is: CB
                    do not use charAt method
 */

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        String firstName=input.next();
        String lastName=input.next();


       String initials= firstName.substring(0,1)+lastName.substring(0,1);

        System.out.println(initials);



    }

}
