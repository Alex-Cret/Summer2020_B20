package SelfPractice;

import java.util.Scanner;

public class withoutFirstChar {
    /*
    Ask user to enter two words. Print first word without its first character then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana
     */
    public static void main(String[] args) {
        //extra task



        String str="I like to drink Pepsi";
        String drink=str.substring(16);
        System.out.println(drink);
        String action=str.substring(10,15);
        System.out.println(action);

        System.out.println("================================================");

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter first word:");
        String word1=input.next();
        System.out.println("Please enter second word: ");
        String word2=input.next();



String result=word1.substring(1).concat(word2.substring(1));

        System.out.println(result);

    }
}
