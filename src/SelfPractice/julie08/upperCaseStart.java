package SelfPractice.julie08;
/*
Write a program that asks user to enter a string.
If string started with uppercase and ends with lowercase letter
 then print true, otherwise print false
        Ex:
           Input: Cybertek
           output: true
           Input: CyberteK
           output: false

 */

import java.util.Scanner;

public class upperCaseStart {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
char first=str.charAt(0);
char last=str.charAt(str.length()-1);

if (first>=65 && first<=90){
    if (last>=97 && last<=122){
        System.out.println(true);
    }else{
        System.out.println(false);
    }

}
    }
}