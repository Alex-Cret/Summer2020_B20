package SelfPractice;

import java.util.Scanner;

public class compareThreeStr {
    /*
    Write a program  CheckWords:
        Program accepts 3 words and :
        - if they are same length:      print "All words are same length"
        - if some same length and others not:    print "Not Same nor Different lengths"
        - if all different length :  print "All different length"

     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first word");
        String str1=input.next();
        System.out.println("Enter second word");
        String str2=input.next();
        System.out.println("Enter thrird word");
        String str3=input.next();

        int l1=str1.length();
        int l2=str2.length();
        int l3=str3.length();
        if (l1==l2 && l2==l3){
            System.out.println("All words are same length");
        }else if (l1!=l2 && l2!=l3){
            System.out.println("All different length");
        }else {
            System.out.println("Not Same or Different lengths");
        }
    }
}
