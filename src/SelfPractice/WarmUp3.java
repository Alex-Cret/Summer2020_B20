package SelfPractice;

import java.util.Scanner;

public class WarmUp3 {
    /*
    Ask user to enter a word. Print true is the first and last characters of the string are same characters, print false otherwise.
            Input:
                abba
            Output:
                true
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your word:");
        String word=input.next();
        char firstChr=word.charAt(0);
        char lastChr=word.charAt(word.length()-1);
        boolean result=firstChr==lastChr;
        System.out.println(result);
    }

}
