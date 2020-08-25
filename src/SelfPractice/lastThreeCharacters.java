package SelfPractice;

import java.util.Scanner;

public class lastThreeCharacters {
    /*
     write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than 3 characters, print the string itself

     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your word:");
        String str=input.nextLine();

        int l=str.length();
        if(l==0) {
            System.out.println("String is empty!");
        }else  if (l>3) {

            System.out.println(str.substring(l - 3));
        } else {
            System.out.println(str);
        }




    }



}
