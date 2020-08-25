package SelfPractice.stringmethods;
/*
 Ask user to enter a word. If the first or second or both letter of the word is x, print the word without x(s). If x is the third letter it should be printed. If the first and second are x, both should be ignored.
                    Input:
                        xxode
                    Output:
                        ode
                    Input:
                        oxidex
                    Output:
                        oidex
 */

import java.util.Scanner;

public class checkFirstTwoChar {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your word:");
        String word=input.next();
if(word.startsWith("x") ) {
   String str=word.substring(1);
    word.startsWith("x");
    if (str.startsWith("x")){
        System.out.println(str.substring(1));
    }
  }

}







    }

