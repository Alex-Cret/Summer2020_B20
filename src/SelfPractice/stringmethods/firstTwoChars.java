package SelfPractice.stringmethods;
/*
ask the user to enter a word.
        if the word ends with "ly", print "really???"
        otherwise, print "never mind"
 */

import java.util.Scanner;

public class firstTwoChars {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter first word:");
        String str=input.next();

        boolean result=str.charAt(0)=='l'&& str.charAt(1)=='y';

        if(result){
            System.out.println("Realy?");
        }else{
            System.out.println("Never mind");
        }
    }


}


