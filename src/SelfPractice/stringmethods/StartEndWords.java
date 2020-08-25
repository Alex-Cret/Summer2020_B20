package SelfPractice.stringmethods;

/*
 Write a program StartEndWords:
    you have 2 words that must be 5 characters, and check if last letter of first word and first letter of second work are same.
        if either one not 5 chars length:    print "need to be exactly 5 chars length"
        if last letter of 1st word and first letter of 2nd word match:  print "Fizz"
        if they do not match:  print "Buzz - did not match"
        NOTE: you will need nested If
 */

import java.util.Scanner;

public class StartEndWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first word:");
        String str1 = input.next();
        System.out.println("Enter second word:");
        String str2 = input.next();

        int l1 = str1.length();
        int l2 = str2.length();

        if (l1 == 5 && l2 == 5) {

            if (str1.charAt(l1 - 1) == str2.charAt(0)) {
                System.out.println("Fizz");
            } else {
                System.out.println("Buzz-did not match");
            }
        } else {
            System.out.println("need to be exactly 5 chars length");

        }

        /*


        System.out.println("===========Second Method===============");

        boolean b1 = str1.endsWith("" + (l1 - 1));
        boolean b2 = str2.endsWith("" + str2.charAt(0));

        if (b1 && b2) {
            System.out.println("Fizz");
        } else {
            System.out.println("Buzz");
        }


    }else{
        System.out.println("need to be exactly 5 chars length");
    }
 */
    }
}


