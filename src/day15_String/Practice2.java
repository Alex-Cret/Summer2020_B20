package day15_String;

import java.util.Scanner;

public class Practice2 {
    // write a program than ask user to enter sentence.
    // then print out the first and last characters
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your sentence: ");
        String sentence=input.nextLine();
        char ch1=sentence.charAt(0);
        int lastIndexNumber=sentence.length()-1;
        char ch2=sentence.charAt(lastIndexNumber);
        System.out.println("First caracter in sentence is: "+ch1);
        System.out.println("Last character in sentence is: "+ch2);

    }
}
