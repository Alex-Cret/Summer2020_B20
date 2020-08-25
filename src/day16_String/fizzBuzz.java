package day16_String;
/*
 Write a program StartEndWords:
    you have 2 words that must be 5 characters, and check if last letter of first word and first letter of second work are same.
        if either one not 5 chars length:    print "need to be exactly 5 chars length"
        if last letter of 1st word and first letter of 2nd word match:  print "Fizz"
        if they do not match:  print "Buzz - did not match"
        NOTE: you will need nested If



 */

import java.util.Scanner;

public class fizzBuzz {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter full name:");                          //WRITE YOUR CODE HERE

        String fullName=scan.next();

        if (fullName.contains("Max Payne") || fullName.contains("Alan Wake")){
            System.out.println("User found!");
        }else{
            System.out.println("User not found!");
        }


    }

    }


