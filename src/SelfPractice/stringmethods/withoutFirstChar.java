package SelfPractice.stringmethods;

/*
Ask user to enter a word. If the work contains starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code
 */

import java.util.Scanner;

public class withoutFirstChar {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your word:");
        String word=scan.next();

        if(word.startsWith("x") || word.startsWith("X")) {
         String result=word.substring(1);
            System.out.println(result);
        }else{
            System.out.println(word);
        }




    }



}
