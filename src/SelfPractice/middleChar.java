package SelfPractice;

import java.util.Scanner;

public class middleChar {
    /*
     Write a Java method to display the middle character of a string
        a) If the length of the string is even there will be two middle characters.
        b) If the length of the string is odd there will be one middle character.
                Input :
                    elephant
                Output:
                    The middle character in the string: ph
     */
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter one word:");
        String str=input.next();

        int middle=str.length()/2;


        if (str.length()%2==0){
            System.out.println(str.substring(middle-1,middle+1));

        }else{
            System.out.println(str.charAt(middle));
        }

    }
}

